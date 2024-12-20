package com.example;

import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.source.AbstractSource;
import org.apache.flume.event.EventBuilder;
import org.apache.flume.conf.Configurable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CustomSource extends AbstractSource implements Configurable {
    private static final Logger LOG = LoggerFactory.getLogger(CustomSource.class);
    private String apiUrl;
    private long pollingInterval;
    private volatile boolean running;

    @Override
    public void configure(Context context) {
        apiUrl = context.getString("apiUrl");
        pollingInterval = context.getLong("pollingInterval", 10000L);
    }

    @Override
    public synchronized void start() {
        running = true;
        new Thread(() -> {
            while (running) {
                try {
                    pollApi();
                    Thread.sleep(pollingInterval);
                } catch (InterruptedException e) {
                    LOG.error("Interrupted while sleeping", e);
                    running = false;
                } catch (IOException e) {
                    LOG.error("Error polling API", e);
                }
            }
        }).start();
        super.start();
    }

    @Override
    public synchronized void stop() {
        running = false;
        super.stop();
    }

    private void pollApi() throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        int responseCode = conn.getResponseCode();

        if (responseCode == 200) {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                Event event = EventBuilder.withBody(content.toString().getBytes());
                getChannelProcessor().processEvent(event);
            }
        } else {
            LOG.error("Failed to poll API: HTTP response code {}", responseCode);
        }
    }
}

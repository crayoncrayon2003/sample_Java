# Install maven
## Install
```
sudo apt update
sudo apt install maven
```
## Check
```
mvn -version
```

# How to use
## Root Dir
```
cd 90_Maven/
```

## Make MavenProject
```
mvn -B archetype:generate \
    -DgroupId=com.example \
    -DartifactId=helloworld \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4
```

## Edit JavaFile
```
cd helloworld/src/main/java/com/example
```

## Edit pom.xml
```
<plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-jar-plugin</artifactId>
          <version>3.2.0</version>
          <configuration>
            <archive>
              <manifest>
              <mainClass>com.example.App</mainClass>
              </manifest>
            </archive>
          </configuration>
        </plugin>
</plugins>
```

## Make JarFile
```
cd helloworld
mvn clean package
```

## Run
```
java -jar target/helloworld-1.0-SNAPSHOT.jar
```


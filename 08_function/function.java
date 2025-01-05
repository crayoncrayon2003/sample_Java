public class function {
    public static void main(String[] args) {
        int sec1 = toSeconds(12, 34, 56);
        System.out.println(sec1);
    }

    public static int toSeconds(int hour, int min, int sec) {
        int answer = hour * 3600 + min * 60 + sec;
        return answer;
    }
}

package ZaurTrigulov.lesson14;

public class Time {
    public static void main(String[] args) {
        timeCounter();

    }

    public static void timeCounter() {
        HOURS:
        for (int i = 0; i < 24; i++) {
            MINUTES:
            for (int j = 0; j < 60; j++) {
                SECONDS:
                for (int k = 0; k < 60; k++) {
                    if (i > 1 && j % 10 == 0) {
                        break HOURS;    // {break HOURS} == end method;
                    }
                    if (k * i > j) {
                        continue MINUTES;
                    }
                    System.out.println("Время: " + i + ":" + j + ":" + k);
                }
            }
        }
    }
}


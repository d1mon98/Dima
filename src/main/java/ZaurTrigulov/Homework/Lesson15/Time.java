package ZaurTrigulov.Homework.Lesson15;

public class Time {

    public static void Clock() {

        int hour = 0;

        HOURS:
        while (hour < 24) {
            int minute = -1;

            MINUTES:
            do {
                minute++;

                if (hour > 1 && minute % 10 == 0) {
                    break HOURS;
                }
                int second = 0;

                SECONDS:
                while (second < 60) {
                    if (second * hour > minute) {
                        continue MINUTES;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }

            }

            while (minute < 59);

            hour++;
        }

    }


        /*for (int hour = 0; hour < 6; hour++) {

            MINUTES:
            for (int minute = 0; minute < 60; minute++) {


                SECONDS:
                for (int second = 0; second < 60; second++) {

                    System.out.println(hour + ":" + minute + ":" + second);
                }

            }

        }}*/


    public static void main(String[] args) {
        Clock();
    }
}

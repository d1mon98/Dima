package ZaurTrigulov.Homework.Lesson15;

public class TimeSimple {

    public static void Time() {

        int hour = 0;
        int minute = 0;
        int second = 0;

        OUTER:
        while (hour < 24) {


            MIDDLE:
            do {
                ;

                INNER:
                while (second < 60) {
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
                minute++;

            }
            while (minute < 60);
            hour++;
        }

    }

    public static void main(String[] args) {
        Time();
    }
}


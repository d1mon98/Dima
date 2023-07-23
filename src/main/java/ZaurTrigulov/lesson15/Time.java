package ZaurTrigulov.lesson15;

public class Time {
    public static void main(String[] args) {
        timeCounter();

    }
    public static void timeCounter() {
        int chas = 0;

        OUTER:
        while (chas < 24) {
            int minuta = -1;

            MIDDLE:
            do {
                minuta++;
                int sekunda = 0;

// condition statement with "chas" and "minuta" vars (no need to go to inner loop and do additional
// checks every INNER loop count:
               if (chas > 1 && minuta % 10 == 0) {
                break OUTER;    // {break OUTER} == end method;
               }

                INNER:
                while (sekunda < 60) {

// condition statement with "secunda" var:
                    if (sekunda * chas > minuta) {
                        continue MIDDLE;
              }

                    System.out.println("Время: " + chas + ":" + minuta + ":" + sekunda);
                    sekunda++;
                }
            }
            while (minuta < 59);
            chas++;
        }
    }
}






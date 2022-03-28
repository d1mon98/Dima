package itpark.lesson4;

import java.util.Scanner;

public class Koren {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, из которого вы хотите вычислить квадратный корень: ");
        double n = in.nextInt();
        if (n % 1 == 0) {
            for (int i = 1; i <= n / i; i++) {
                // System.out.println(i);
                System.out.println((double) (n / i));
                if (i == n / i & (i * i == n)) {
                    System.out.println("Корень = " + i);
                } else {
                    if (i * i != n) {
                        //  System.out.println("no");
                    }

                }
            }
        } else {System.out.println("Число, из которого вы хотите вычислить квадратный корень не являтся целым, " +
                "введите целое число: ");


        }
    }

}



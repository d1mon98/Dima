package itpark.lesson4;

import java.util.Scanner;

public class Koren {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, из которого вы хотите вычислить квадратный корень: ");
        int n = in.nextInt();
        for (int i = 1; i <= n / i; i++) {
            if (i == n / i & ((n/i) % 1 == 0)) {
                System.out.println("Корень = " + i);
            }
        }
    }
}



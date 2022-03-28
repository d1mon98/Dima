package itpark.lesson4;

import java.util.Scanner;

public class Koren {

    public static void main(String[] args) {
        int i;
        System.out.println("Введите целое число, из которого вы хотите вычислить квадратный корень: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (i = 1; i * i <= n; i++) {
            if (i * i == n) {
                System.out.println("Квадратный корень из числа " + n + " = " + i);
            }
        }
        if ((i - 1) * (i - 1) != n) {
            System.out.println("Число " + n + " не имеет целочисленного квадратного корня");
        }
    }
}







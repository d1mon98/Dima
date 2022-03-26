package itpark.lesson3;

import java.util.Scanner;

public class FactorialResolve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вычисление факториала числа");
        System.out.println("Введите число, для которого вы хотите вычислить факториал");
        int n = in.nextInt();
        System.out.println("Факториал числа " + "" + n + " = " + calculateFactorial(n));
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}

package itpark.lesson3;


import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Вычисление факториала числа n! " +
                "Введите n (целое число)");
        long value = in.nextLong();
        System.out.println("Факториал " + (long) value + "! = " + calculateFactorial(value));

    }

    public static long calculateFactorial(long n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return (long) result;
    }
}
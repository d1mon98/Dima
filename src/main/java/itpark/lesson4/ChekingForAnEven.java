package itpark.lesson4;

import java.util.Scanner;

public class ChekingForAnEven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Проверка на то, является ли число целым");
        System.out.println("Введите число a");
        double a = in.nextDouble();
        if (a % 2 != 1 && a % 2 != 0) {
            System.out.println("Вы ввели целое число " + a);
        } else {
            System.out.println("Вы ввели не целое число " + a);
        }

    }

}

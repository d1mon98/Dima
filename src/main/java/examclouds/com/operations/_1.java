/*
1. Проверка четности числа
Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нет.
Ввод числа осуществлять с помощью класса Scanner.
Если пользователь введёт не целое число, то сообщать ему об ошибке.- ???????????

не знаю как сделать проверку на то является ли число целым
 */

package examclouds.com.operations;

import java.util.Scanner;

public class _1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Проврека четности числа");
        System.out.print("введите целое число: ");
        double digit = scanner.nextDouble();

        if (digit % 2 == 0) {
            System.out.println();
            System.out.println("число является четным");
        } else if (digit % 1 != 0) {
            System.out.println();
            System.out.println("число является не целым, введите целое число");
        } else {
            System.out.println();
            System.out.println("число является не четным");
        }
    }

}


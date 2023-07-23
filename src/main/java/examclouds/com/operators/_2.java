/*
С помощью класса Scanner ввести целое число.
Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10 или ноль”,
иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
Используем оператор if-else.
 */

package examclouds.com.operators;

import java.util.*;

public class _2 {
    static void checkNumber(int a) {

        if (a >= 0 && a <= 10) {
            System.out.println("Если это число от 0 до 10");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        String digit = input.next();

        checkNumber(Integer.parseInt(digit));
    }

}

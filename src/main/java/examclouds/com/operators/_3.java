/*

Передать на вход программы число от 1 до 7 в качестве аргумента.
Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
Используем конструкцию if-else-if.
 */


package examclouds.com.operators;

import java.util.Scanner;

public class _3 {

    public static void weekdays(int day) {



        if (day == 1) {
            System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        } else if (day == 4) {
            System.out.println("Четверг");
        } else if (day == 5) {
            System.out.println("Пятница");
        } else {
            System.out.println("Выходной");
        }

    }

    public static void main(String[] args) {
        System.out.print("Введите день недели в виде числа от 1 до 7: ");
        Scanner input = new Scanner(System.in);
        String digit = input.next();
        weekdays(Integer.parseInt(digit));
    }
}

/*
6. Напишите Java-программу для печати суммы (сложения), умножения, вычитания, деления и остатка двух чисел. Перейти к редактору
Тестовые данные:
Введите первое число: 125
Введите второе число: 24
Ожидаемый результат :
125 + 24 = 149
125 - 24 = 101
125 х 24 = 3000
125/24 = 5
125 мод 24 = 5

Нажмите меня, чтобы увиде
 */
package kodsource.top.basic_exercises;

import java.util.*;

public class _6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int n2 = scanner.nextInt();

        int sum = n1 + n2;
        int minus = n1 - n2;
        int multiply = n1 * n2;
        int subtract = n1 + n2;
        int divide = n1 / n2;
        int rnums = n1 % n2;
        System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, subtract, divide, rnums);



        /*

        System.out.println();
        System.out.println(s1 + " + " + s2 + " = " + (Integer.parseInt(s1) + Integer.parseInt(s2)));
        System.out.println(s1 + " - " + s2 + " = " + (Integer.parseInt(s1) - Integer.parseInt(s2)));
        System.out.println(s1 + " x " + s2 + " = " + (Integer.parseInt(s1) * Integer.parseInt(s2)));
        System.out.println(s1 + " / " + s2 + " = " + (Integer.parseInt(s1) / Integer.parseInt(s2)));
        System.out.println(s1 + " мод " + s2 + " = " + (Integer.parseInt(s1) % Integer.parseInt(s2)));
    */
    }


}

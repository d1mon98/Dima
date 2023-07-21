/*
2. Напишите программу на Java для вывода суммы двух чисел. Перейти к редактору
Тестовые данные:
74 + 36
Ожидаемый результат :
110
 */

package kodsource.top.basic_exercises;

import java.util.Scanner;
public class _2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
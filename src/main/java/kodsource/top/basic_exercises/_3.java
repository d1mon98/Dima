/*
3. Напишите программу на Java, чтобы разделить два числа и напечатать на экране. Перейти к редактору
Тестовые данные:
50/3
 */

package kodsource.top.basic_exercises;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = input.nextDouble();
        double div = num1 / num2;
        System.out.println();
        System.out.println("The division of " + num1 + " and " + num2 +" is: "+div);
    }
}

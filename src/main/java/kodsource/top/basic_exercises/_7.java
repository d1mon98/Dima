/*
7. Напишите программу на Java, которая принимает число в качестве входных данных
и печатает свою таблицу умножения до 10. Перейти к редактору
Тестовые данные:
Введите число: 8
Ожидаемый результат :
8 х 1 = 8
8 х 2 = 16
8 х 3 = 24
...
8 х 10 = 80
 */


package kodsource.top.basic_exercises;

import java.util.*;

public class _7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
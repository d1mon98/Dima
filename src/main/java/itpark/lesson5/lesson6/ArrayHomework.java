package itpark.lesson5.lesson6;

import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер одномерного массива");
        int n = scanner.nextInt();
        int i;
        System.out.println("Вы ввели длину массива = " + n);
        System.out.println();

// Заполнение массива длиной "n"
        int[] digitsResolve = new int[n];

// заполнение массива рандомными значениями  - через цикл for
        for (i = 0; i < n; i++) {
            digitsResolve[i] = (int) (Math.random() * 10);
        }

//вывод всех значений массива
        System.out.println("Массив:");
        for (i = 0; i < n; i++) {
            System.out.println(digitsResolve[i]);
        }
        System.out.println();

// минимальное значение
        int min = digitsResolve[0];
        for (i = 0; i < n; i++) {
            if (min > digitsResolve[i]) {
                min = digitsResolve[i];
            }
        }
        System.out.println("Минимальное значение массива = " + min);
        System.out.println();

// максимальное значение
        int max = digitsResolve[0];
        for (i = 0; i < n; i++) {
            if (max < digitsResolve[i]) {
                max = digitsResolve[i];
            }
        }
        System.out.println("Максимальное значение массива = " + max);
        System.out.println();

// среднее значение
        int sum = 0;
        for (i = 0; i < n; i++) {
            sum += digitsResolve[i];
        }
        double averege = (double) sum / digitsResolve.length;
        System.out.println("Среднее значение массива = " + averege);
        System.out.println();


    }
}


package itpark.lesson6;

import java.util.Scanner;

public class FiboArray {
    public static void main(String[] args) {

//объявление переменных
        int i;
        int k = 0;

// Создание массива для записи значений ряда Фибоначчи
        Integer[] FiboArray = new Integer[46];

// Вывод массива на печать
        System.out.println("Кэш массив:");
        for (i = 0; i < 46; i++) {
            System.out.println(FiboArray[i]);
        }

// Ввод с клавиатуры номер члена ряда Фибоначчи
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер члена ряда Фибоначчи, который вы хотите вычислить");
        int fibNumber = scanner.nextInt();

// Создание массива длинна которого определяется порядковым номером ряда Фибоначчи
        int[] elasticArray = new int[fibNumber];

// Рассчёт Фибоначчи и запись их в массив - через цикл for
        for (i = 0; i < fibNumber; i++) {
            FiboArray[i] = k;
            k++;
        }

//вывод  значений Фибоначчи - массива
        for (i = 0; i < fibNumber; i++) {
            System.out.println(FiboArray[i]);
        }
        System.out.println();

    }
}




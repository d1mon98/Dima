package itpark.lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalculation {

    public static void main(String[] args) {
        System.out.println("Приветствую, укажите длину массива как целое число");
        int arrayLength = getArrayLength();
        int[] array = fillArray(arrayLength); // переменная array в которой содержится искомый массив
        System.out.println(Arrays.toString(array));
        int max = getMax(array);
        System.out.println("Максимум в массиве: " + max);
        int max2 = getAnotherMax(array);
        System.out.println("Максимум в массиве (другой способ): " + max2);
        int min = getMin(array);
        System.out.println("Минимум в массиве: " + min);
        double avg = getAvg(array);
        System.out.println("Среднее арифметическое в массиве соответсвует: " + avg);
    }

    private static double getAvg(int[] array) {
        double avg = 0;
        for(int digit: array){
            avg +=digit;
        }
        avg /= array.length;
        return avg;
    }

    private static int getMax(int[] array) {
        //вычисление максимального значения
        // в качестве максимума взят первый элемент
        int max = array[0]; // переменная, которая хранит текущий максимум
        for (int digit : array) {
            if (digit > max) {
                max = digit;
            }
        }
        return max;
    }

    private static int getAnotherMax(int[] array) {
        int max = array[0];
        for (int digit : array) {
            max = Math.max(max, digit);
        }
        return max;
    }

    private static int getMin(int[] array) {
        int min = array[array.length - 1];
        if (array.length > 1) {
            for (int index = array.length - 2; index >= 0; index--) {
                int digit = array[index];
                if (digit < min) {
                    min = digit;
                }
            }
        }
        return min;
    }

    private static int[] fillArray(int arrayLength) {
        int[] digits = new int[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            digits[index] = Math.round((float) Math.random() * 1000); //[0,1000)
        }
        return digits;
    }

    private static int getArrayLength() {
        Scanner scanner = new Scanner(System.in);
        //поверка на то, является ли введенное число целым
        while (!scanner.hasNext()) {
            System.out.println("Простите, но ввод значения подразумевает целое число:");
            scanner.next();
        }
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.printf("Вы указали отрицательное значение %d, что недопустимо в программе\n", length);
            return getArrayLength();
        }
        return length;
    }
}

/*
1. Создаем код для получения длины массива и оборачиваем его в метод getArrayLength()
2. Создаем перенменную arrayLength, которая будет принимать значения от метода getArrayLength()
3. Объявляем массив, размером arrayLength (значение которое пришло из метоода getArrayLength()
- и было введено пользователем
4. Делаем цикл for для заполнения массива, длина цикла от 0 до arrayLength
5. Заполняем массив случайными числами при помощи метода Math.random(), для того чтобы получпные значения были int
дополнительно оборачиваем его в метод Math.round и еще нужно чтобы он сработал, явно обозначить то что подается
ему на вход как float
6. Оборачиваем код для заполнения массива в метод fillArray, у полученного метода меняем void на возвращаемое значене
int []
7. Выделяем методу fillArray переменную int[] array

 */

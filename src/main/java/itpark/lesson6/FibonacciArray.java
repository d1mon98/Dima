package itpark.lesson6;

import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {

        //задаём переменную с длиной массива для записи ряда Фибоначчи
        int arrayLength = 50;

        // создаём массив с длиной, заданой переменной arrayLength
        long[] fibonacciArray = new long[arrayLength]; // 1 1 2 3 5 8 13 21 34 55 89 144

        //задаём первые два значения ряда Фибоначчи
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;

        // привествуем пользователя
        System.out.println("Приветствуем уважаемый пользователь");

        // ?
        int lastIndex = 2;



        while (true) {
            int index = getFibonacciIndex(arrayLength);
            long result;
            if (fibonacciArray[index] == 0) {
                fillFibonacciArray(fibonacciArray, lastIndex, index);
            }
            result = fibonacciArray[index];
            System.out.printf("Число, стоящее на %d индексе имеет значение %d\n", index, result);
        }
    }

    // метод fillFibonacciArray для заполнения массива fibonacciArray
    public static void fillFibonacciArray(long[] fibonacciArray, int lastIndex, int index) {

        //?
        System.out.printf("Значение с индексом %d было рассчитано и размещено в кэше\n", index);
        for (int i = lastIndex; i <= index; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
    }


    // метод обработки значенния порядкового номера числа Фибоначчи (пускает программу по вилке вариантов)
    public static int getFibonacciIndex(int maxIndex) {


        // тект для пользователя
        System.out.println("Введите позицию в ряде Фибоначчи как целое число:");

        // вилка вариантов, в завимтости от того что ввел польователь:
        // дробное;
        // отрицательное;
        // команду exit

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            String command = scanner.next();
            if ("exit".equalsIgnoreCase(command)) {
                System.out.println("Спасибо за участие в программе");
                System.exit(0);
            }
            System.out.println("Простите, но ввод значения подразумевает целое число");
        }
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.printf("Вы указали отрицательное значение %d, что не допустимо в программе\n", length);

            // возврат в начало метода getFibonacciIndex
            return getFibonacciIndex(maxIndex);

            //логическое ответвление  - если введеная блина больше максимально допустимой  - maxIndex
        } else if (length >= maxIndex) {
            System.out.printf("Вы указали значение большее, чем допустимо в программе\n", maxIndex);
            return getFibonacciIndex(maxIndex);
        }
        return length;
    }
}

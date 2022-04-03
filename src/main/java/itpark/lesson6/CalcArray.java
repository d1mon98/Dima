package itpark.lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class CalcArray {
    public static void main(String[] args) {
        System.out.println("Здравствуйте, укажите длину массива, как целое число");
        int arrayLength = getArrayLength();
        int[] array = fillArray(arrayLength);
        System.out.println(Arrays.toString(array));
        int max = getMax(array);
        System.out.println("Максимум в массиве: " + max);
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for(int digit: array){
            if (digit > max){
                max = digit;
            }
        }
        return max;
    }

    private static int[] fillArray(int arrayLength) {
        int[] digits = new int[arrayLength];
        for(int index = 0; index< arrayLength; index++){
            digits[index] = Math.round((float) Math.random()*1000); // [0, 1000)
        }
        return digits;
    }

    private static int getArrayLength() {
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
            System.out.println("Простите, но ввод значений продразумевает целое число");
            scanner.next();
        }
        return scanner.nextInt();
    }

}

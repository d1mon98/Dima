package ZaurTrigulov.lesson18;

import java.util.Arrays;
// Bubble sort with recursion
public class BubbleSortRecursion {
    public static void bubbleSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                count++;
            }
            if (count > 0) {
                bubbleSort(array);
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {-4, 5, 3, -55, 0, 1, 194, -54};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }
}

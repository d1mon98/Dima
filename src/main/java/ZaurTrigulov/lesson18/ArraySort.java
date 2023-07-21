package ZaurTrigulov.lesson18;

import java.util.Arrays;

public class ArraySort {

    public static void sortirovka(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j=0; j < array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        sortirovka(new int[]{2, 3, 4, -555, -1, -3,55,66,77,888,-34,-343,-3330 });
    }
}

package ZaurTrigulov.lesson18;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort (int[] array){
        boolean unosorted = true;
        int tmp;
        while (unosorted){
            unosorted = false;
            for (int i=0;i<array.length-1;i++){
                if (array[i]>array[i+1]){
                    tmp =array[i];
                    array[i]=array[i+1];
                    array[i+1]=tmp;
                    unosorted = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array =  {-4,5,3,-55,0,1,194,-54};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }
}

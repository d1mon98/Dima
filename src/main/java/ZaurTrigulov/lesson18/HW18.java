package ZaurTrigulov.lesson18;

import java.util.Arrays;

public class HW18 {
    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.print(" }");
    }

    public static void main(String[] args) {
        String[][] array = new String[][]{{"2", "3"}, {"4", "5"}};
        showArray(array);
        System.out.println();
        String[][] array2={{"123","2"},{"1","32","55"},{"4"}};
        showArray(array2);
        // System.out.println(showArray(array));
    }
}

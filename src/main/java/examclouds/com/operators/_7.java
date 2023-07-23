/*
7. Распечатать 5 символом циклом for.
Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for.
 */

package examclouds.com.operators;

public class _7 {

    public static void main(String[] args) {
        char symbol = 'a';

        for (int i = 1; i < 27; i++) {
            System.out.print(symbol++ + " ");

        }


    }
}

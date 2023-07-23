/*
6. Распечатать числа циклом do-while.
Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.
*/

package examclouds.com.operators;

public class _6 {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (++i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }
        while (i <= 100);

    }
}

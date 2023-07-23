/*

9. Факториал.
Реализовать подсчет факториала используя цикл for. Пример вычисления факториала:
n! = 1*2*...*n;
0! = 1;
5! = 1*2*3*4*5;
Число n задается случайным образом (используйте Math.random()). Оно должно быть в диапазоне от 0 до 5.

*/

package examclouds.com.operators;

public class _9 {
    public static void main(String[] args) {

        int result = 1;
        int r = (int) (Math.random() * 6);
        System.out.println("Рандомное число = " + r);

        for (int n = 1; n <= r; n++) {
            result = result * n;
        }
        System.out.println(result);
    }
}

/*
1. Четное-нечетное.

Передать на вход программы число в качестве аргумента.
Если оно нечетное, распечатать его.
Используем оператор if.
Используйте метод Integer.parseInt() для преобразования из String в int.
 */

package examclouds.com.operators;
import java.util.Scanner;
public class _1 {

    //проверка на четность

    static void ostatok(int a) {

        int ostatok = a % 2;
        if (ostatok == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is not even");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input digit: ");
        String digit = input.next();
        ostatok(Integer.parseInt(digit));

    }

}

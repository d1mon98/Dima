/*

5. Напишите программу Java, которая принимает два числа в качестве входных данных и отображает произведение двух чисел. Перейти к редактору
Тестовые данные:
Введите первое число: 25
Введите второе число: 5
Ожидаемый результат :
25 х 5 = 125

 */

package kodsource.top.basic_exercises;
import java.util.*;
public class _5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String s1 = scanner.next();
        System.out.print("Введите второе число: ");
        String s2 = scanner.next();


        System.out.println(s1 + " x " + s2 + " = " + Integer.parseInt(s1)*Integer.parseInt(s2));
    }
}

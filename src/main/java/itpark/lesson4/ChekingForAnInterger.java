package itpark.lesson4;

import java.util.Scanner;

public class ChekingForAnInterger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Проверка на числа на четность");
        System.out.println("Введите число a");
        int a = in.nextInt();
        if (a % 2 == 0)
        System.out.println("Вы ввели четное число " + a);
        else
            System.out.println("Вы ввели нечетное число " + a);

    }

}

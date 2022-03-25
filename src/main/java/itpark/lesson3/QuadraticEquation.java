package itpark.lesson3;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите коэффициент a");
        int a = in.nextInt();
        System.out.println("Введите коэффициент b");
        int b = in.nextInt();
        System.out.println("Введите коэффициент c");
        int c = in.nextInt();

        double D = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Первый коэффициент не может равняться 0");
        } else if (D < 0) {
            System.out.println("Дискрименант меньше 0, у уравнения нет действительных решений");

        } else if (D == 0) {
            System.out.println("Дискрименант равен 0, у уравнения единственный корень = " + (-b + Math.sqrt(D)) / (2 * a));
        } else {
            System.out.println("x1 = " + (-b + Math.sqrt(D)) / (2 * a));
            System.out.println("x1 = " + (-b - Math.sqrt(D)) / (2 * a));
        }

    }
}
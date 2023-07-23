package ZaurTrigulov.lesson13;

import java.util.Scanner;

public class Month {
    public static void Month() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядковый номер месяца в виде числа от 1 до 12 : ");
        int s1 = scanner.nextInt();

        switch (s1) {

            case 2:
                System.out.println("В этом месяце 28 дней");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 дней");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день");
                break;
            default:
                System.out.println("Месяца с таким порядковым номером не существует");
                break;
        }


    }

    public static void main(String[] args) {

        Month.Month();

    }


}
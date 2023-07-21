/*
Напишите программу на Java, которая напечатает «Hello» на экране, а затем напечатайте свое имя в отдельной строке. Перейти к редактору
Ожидаемый результат :
Привет
Александра Абрамова
 */

package kodsource.top.basic_exercises;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello \n" + fname + " " + lname);

    }
}

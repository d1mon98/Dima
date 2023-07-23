/*
4. Дни недели с оператором switch.
Переписать задание "3. Дни недели" используя оператор switch.
 */

package examclouds.com.operators;

import java.util.Scanner;

public class _4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day of the week as a number from 1 to 7 : ");
        int s = scanner.nextInt();


        switch (s) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;


            default:
                System.out.println("There is no single day for such a figure");
        }


    }


}

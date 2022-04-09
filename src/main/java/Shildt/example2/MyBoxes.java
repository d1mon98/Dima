package Shildt.example2;

public class MyBoxes {
    public static void main(String[] args) {

        /* создать объект mybox1 класса Box */
        Box mybox1 = new Box(10,20,15);

        /* создать объект mybox2 класса Box */
        Box mybox2 = new Box(3,6,9);

        //рассчёт и вывод объема первого параллелепипеда
        System.out.println("Объем равен " + mybox1.volume());

        //рассчёт и вывод объема второго параллелепипеда
        System.out.println("Объем равен " + mybox2.volume());

    }

}

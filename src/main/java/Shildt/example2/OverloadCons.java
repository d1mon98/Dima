package Shildt.example2;

public class OverloadCons {
    public static void main(String[] args) {
        //создать параллелепипеды используя разные конструкторы

        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);

        // получить объём первого параллелепипеда
        System.out.println("Объем mybox1 = " +mybox1.volume());

        // получить объём второго параллелепипеда
        System.out.println("Объем mybox2 = " +mybox2.volume());

        // получить объём первого параллелепипеда
        System.out.println("Объем mycube = " +mycube.volume());

        // получить объем клона
         System.out.println("Объем клона= " + myclone.volume());
    }
}

package Shildt.example2;

public class ConversionDemo {
    public static void main(String[] args) {
        byte a;
        int b=257;
        double d =323.142;
        System.out.println();
        System.out.println("Преобразование типа int --> byte.");
        a= (byte) b;
        System.out.println("b (int) = " +b+ ", a (byte) = "+a);
        System.out.println();
        System.out.println("Преобразование типа double --> int.");
        b= (int) d;
        System.out.println("d (double) = " +d+ ", b (int) = "+b);
        System.out.println();
        System.out.println("Преобразование типа double --> byte.");
        a= (byte) d;
        System.out.println("d (double) = " +d+ ", a (byte) = "+a);




    }

}

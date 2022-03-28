package Shildt.example2;

public class DynInit {
    public static void main(String[] args) {
        double a=3, b=4;

//        динамическая инициализация
        double c = Math.sqrt(a*a+b*b);
        System.out.println("Гипотенуза равна " + c);
    }
}

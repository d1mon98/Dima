package itpark.lesson3;

public class QuadraticEquation {
    public static void main(String[] args) {

        int a = 10;
        int b = 100;
        int c = 5;
        double D = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Первый коэффициент не может равняться 0");
        } else if (D == 0) System.out.println("Дискрименант равен 0,  у уравнения нет действительных решений");


    }
}
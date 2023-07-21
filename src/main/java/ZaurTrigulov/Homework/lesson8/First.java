package ZaurTrigulov.Homework.lesson8;

public class First {

    static final double Pi = 3.14;


    static int multiplication(int a, int b, int c) {
        System.out.println("Произведение " + a + "*" + b + "*" + c + "= " + a * b * c);
        return a * b * c;
    }

    static void divisionWithRemainder(int a, int b) {
        System.out.println(a + "/" + b + ": целое частное= " + a / b + ", остаток от деления= " + a % b);
    }

    void circleArea(double r) {
        System.out.println("Площадь круга= " + Pi * r * r);
    }

    static public void circumference(double r) {
        System.out.println("Длина окружности= " + 2 * Pi * r);
    }

    void calc(double r) {

        System.out.println("Радиус =" + r);
        circleArea(r);
        circumference(r);

    }

}

class Test {
    public static void main(String[] args) {
        First.multiplication(4, 2, 10);
        First.divisionWithRemainder(12, 3);

        First f1 = new First();
        f1.circleArea(10);

        First.circumference(10);
        System.out.println();
        f1.calc(10);


    }


}


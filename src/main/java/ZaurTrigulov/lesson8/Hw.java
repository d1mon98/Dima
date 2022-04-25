package ZaurTrigulov.lesson8;

public class Hw {

    final static double Pi = 3.14;

    public double circleArea(double r) {
        double S = r * r * Pi;
        return S;
    }

    static double circumference(double r) {
        double L = 2 * Pi * r;
        return L;
    }

    void result(double r) {
        System.out.println("r =  " + r + ", Sкруга = " + circleArea(r) + ", Lокр. = " + circumference(r));
    }

    static double multiply(double a, double b, double c) {
        // System.out.println("Произведение трех чисел " + a + "*" + b + "*" + c + " = " + a * b * c);
        return a * b * c;
    }

    static void divisionWithReminder(int a, int b) {
        System.out.println("Целая часть от деления числа " + a + "/" + b + " = " + a / b + "," +
                " а целочисленный остаток = " + a % b);
    }
}


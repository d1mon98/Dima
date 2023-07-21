package ZaurTrigulov.lesson5;

public class Test20 {

    int summa(int a, int b, int c) {
        return a + b + c;
    }

    int arithmeticMean(int a, int b, int c) {
        return summa(a, b, c) / 3;
    }

    void showInfo(int a, int b, int c) {
        System.out.println("Сумма чисел " + a + ", " + b + ", " + c + " = " + summa(a, b, c));
        System.out.println("Среднее арифметическое чисел " + a + ", " + b + ", " + c + " = " + summa(a, b, c) / 3);

    }

}

class Test21 {
    public static void main(String[] args) {
        Test20 t = new Test20();

        t.showInfo(5, 10, 15);
        System.out.println();
        t.showInfo(20, 40, 60);
    }
}




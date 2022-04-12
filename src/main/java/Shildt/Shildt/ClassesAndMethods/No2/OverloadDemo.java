package Shildt.Shildt.ClassesAndMethods.No2;

// применить автоматическое преобразование типов к перегрузке
public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутвуют");
    }

    // Перегружаемый метод, проверяющий наличие двух
    // целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);

    }

    // Перегружаемый метод проверяющий наличие параметра типа double
    void test(double a) {
        System.out.println("Внутренее преобразование при вызове test(double) a: " + a);
    }
}

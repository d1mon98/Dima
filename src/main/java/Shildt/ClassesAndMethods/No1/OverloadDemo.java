package Shildt.ClassesAndMethods.No1;

//демонстрация перегрузки методов (методы подцепляются один из другого, наследник получает конструкцию
// родительского метода - перегрузка методов является отражением принципа полиморфизма Java

public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    //Перегужаемый метод, проверящий наличие
    // одного целочисленного параметра
    void test(int a) {
        System.out.println("a: " + a);
    }

    //Перегужаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    //Перегужаемый метод, проверяющий наличие
    // параметра типа double
    double test(double a) {
        System.out.println("dobule a : " + a);
        return a*a;
    }


}
/*
3. Калькулятор

Создать метод принимающий на вход две переменные типа int.
Метод вычисляет их сумму и возвращает значение.
Вызвать этот метод из метода main.
Сделать методы для вычисления разницы, произведения и деления.

*/


package examclouds.com.JavaSyntax;

public class _3 {

    int plus(int a, int b) {
        return a + b;
    }

    int minus(int a, int b) {
        return a - b;
    }

    int proizvedenie(int a, int b) {
        return a * b;
    }

    int delenie(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        _3 test = new _3();

        System.out.println(test.plus(1, 2));
        System.out.println(test.minus(3, 4));
        System.out.println(test.proizvedenie(5, 4));
        System.out.println(test.delenie(5, 6));


    }


}

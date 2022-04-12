package Shildt.Shildt.ClassesAndMethods.No2;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i=88;

        ob.test();
        ob.test(10,20);
        ob.test(i); /* здесь вывывается вариант метода test(double) - поскольку метода test(int a) нет,
                       Java автоматически продвигает тип int в double и затем вызыввет тип test (double a)
                       если бы вариант test (int a) присутвоввал, безусловно выполнился бы именно он.
                       Автоматическое преобрахование типов в Java выполняется только в том случае, если
                       не обнаружено полное соответсвие */
        ob.test(123.2);// и здесь вывывается вариант метода test(double)
    }
}

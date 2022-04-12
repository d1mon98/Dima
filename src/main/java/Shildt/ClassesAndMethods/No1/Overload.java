package Shildt.ClassesAndMethods.No1;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        // вызвать все варианты метода test
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result=ob.test(12.35);
        System.out.println("Результат выховы метода ob.test(12.35) = " + result);

    }
}

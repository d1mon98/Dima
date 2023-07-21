package ZaurTrigulov.Homework;

public class HwL6 {

    public int sum() {
        return 0;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
    //надо обязательно создать экземпляр класса и применять методы к нему

        HwL6 s = new HwL6();
        System.out.println("Сумма всех чисел = " + s.sum());
        System.out.println("Сумма всех чисел = " + s.sum(1,2));
        System.out.println("Сумма всех чисел = " + s.sum(4,4,6));
        System.out.println("Сумма всех чисел = " + s.sum(7,8,9,10));


    }

}

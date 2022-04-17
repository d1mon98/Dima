package ZaurTrigulov.lesson6;

public class Homework {
    int a1, a2, a3, a4, a5;

    Homework(int a11, int a12, int a13, int a14, int a15) {
        a1 = a11;
        a2 = a12;
        a3 = a13;
        a4 = a14;
        a5 = a15;
    }

    Homework(int a21, int a22, int a23, int a24) {
        this(a21, a22, a23, a24, 0);
    }

    Homework(int a31, int a32, int a33) {
        this(a31, a32, a33, 0, 0);
    }

    Homework(int a41, int a42) {
        this(a41, a42, 0, 0, 0);
    }

    Homework(int a51) {
        this(a51, 0, 0, 0, 0);
    }

    Homework() {
        this(0, 0, 0, 0, 0);
    }


    // создание Overloaded методов
    void summa(int a1, int a2, int a3, int a4, int a5) {
        System.out.print("Сумма пяти аргументов = ");
        System.out.println(a1 + a2 + a3 + a4 + a5);
    }

    void summa(int a1, int a2, int a3, int a4) {
        System.out.print("Сумма четырёх аргументов = ");
        System.out.println(a1 + a2 + a3 + a4);
    }

    void summa(int a1, int a2, int a3) {
        System.out.print("Сумма трёх аргументов = ");
        System.out.println(a1 + a2 + a3);
    }

    void summa(int a1, int a2) {
        System.out.print("Сумма двух аргументов = ");
        System.out.println(a1 + a2);
    }

    void summa(int a1) {
        System.out.print("Вы ввели один агрумент = " + a1 +", сумма не возможна");
    }

    void summa() {
        System.out.print("Вы не ввели аргументов, ответ = ");
        System.out.println(0);
    }


}


class HomeworkRunner {
    public static void main(String[] args) {
        Homework summa1 = new Homework(1,2,3,4,5);
        Homework summa2 = new Homework(1,2,3,4);
        Homework summa3 = new Homework(1,2,3);
        Homework summa4 = new Homework(1,2);
        Homework summa5 = new Homework(1);
        Homework summa6 = new Homework();

        summa1.summa();
        summa2.summa(1);
        summa3.summa(1,2);
        summa4.summa(1,2,3);
        summa5.summa(1,2,3,4);
        summa6.summa(1,2,3,4,5);

    }
}






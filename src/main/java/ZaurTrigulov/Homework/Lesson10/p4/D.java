package ZaurTrigulov.Homework.Lesson10.p4;

import ZaurTrigulov.Homework.Lesson10.p1.*;
import ZaurTrigulov.Homework.Lesson10.p1.p2.p3.*;
import ZaurTrigulov.Homework.Lesson10.p4.p5.*;
import static ZaurTrigulov.Homework.Lesson10.p1.p2.B.*;


public class D {
    int dd = 1;

    public static void main(String[] args) {

        A z1 = new A();
        C z2 = new C();
        E z3 = new E();


        System.out.println(z1.s + ", imported variable = " + z1.a);
        System.out.println(ZaurTrigulov.Homework.Lesson10.p1.p2.B.s + ", imported variable = " + aa);
        System.out.println(z2.c4 + ", imported variable = " + z2.a);
        System.out.println("Class E, imported variable No 1 = " + z3.b + ", imported variable No 2 = " + z3.w);
    }
}

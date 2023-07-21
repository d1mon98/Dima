package ZaurTrigulov.p4;

import ZaurTrigulov.p1.A;       // import class A
import ZaurTrigulov.p1.p2.p3.C; // import class C
import ZaurTrigulov.p4.p5.E;    // import class E
import static ZaurTrigulov.p1.p2.B.*; // import static class B - статические элементы нужно указывать или конкрнетно, или * - что значит - все статические элементы
import static ZaurTrigulov.p4.p5.E.*; // import static class E

public class D {
    String s1 = "Победа";

    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        D d = new D();
        System.out.println(d.s1 + " " + ss + " " + c.st+", " + a.a + " ударов  "+ s + " это всё " + b);
    }
}



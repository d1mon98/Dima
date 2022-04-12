package Shildt.test;

// объекты допускается передавать методам
// в качестве параметров

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // возвратить логическое значение true, если в качестве параметра o указан  вызывающий объект
    boolean eeequalTo(Test oooP) {
        if (oooP.a == a && oooP.b == b) return true;
        else return false;
    }
}

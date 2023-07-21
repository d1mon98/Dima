package ZaurTrigulov.lesson9;

public class Hw9_4 {
    int a = 1;
    static int b=2;
    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Hw9_4.b);
    }

    public static void main(String[] args) {
        Hw9_4 t = new Hw9_4();
        t.abc(4);
    }
}

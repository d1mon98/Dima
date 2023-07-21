package ZaurTrigulov.lesson9;

public class Hw9_2 {
    int a=1;
   // static int a=2;   // instance variables имеют одинаковое имя, что недопустимо
    void abc (int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Hw9_2 t= new Hw9_2();
        t.abc(3);
    }
}

package ZaurTrigulov.lesson8;

public class Test1 {

    public static int a = 0;

    public static void main(String[] args) {

        Test1 t = new Test1();
        t.a++;
        System.out.println(t.a);
        t.a++;
        t.a++;
        t.a++;
        t.a++;
        System.out.println(t.a);


        Test1 t2 = new Test1()
                ;
        t2.a++;
        System.out.println(t2.a);


    }

}

class StudentTest{


    public static void main(String[] args) {
        Test1.a++;
        Test1.a++;
        Test1.a++;
        Test1.a++;


        System.out.println(Test1.a);

    }



}

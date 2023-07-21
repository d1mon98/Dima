package ZaurTrigulov.lesson3;

public class test8 {

    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;

        result = i2 / d1 + d2 % i1 - l;   // = 2 + 1.3-20 = -16,7
        System.out.println(result);


        int a = 5;
        int b = 8;

        int result2 = a-- - --a + ++a + a++ + a; //5-3 + 4 + 4 +5 = 15
        //a=3


        System.out.println(result2 + " " + a);

        int result3 = ++b - b++ + ++b - --b;    //9 -9 + 11 - 10 = 1
                                                // b=10

        System.out.println(result3 + " " + b);

    }


}

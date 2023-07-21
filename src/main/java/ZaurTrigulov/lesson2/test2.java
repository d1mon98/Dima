package ZaurTrigulov.lesson2;

public class test2 {
    public static void main(String[] args) {
        byte b1 =1___0; //10
        byte b2 =0____1______2; //8
        byte b3 = 0b1_0__________1____0; //2
        byte b4 = 0xA; //16

        //---------------------

        short c1 = -1300; //10
        short c2 = -0____2424; //8
        short c3 = -0b10_1000_10_100; //2
        short c4 = -0x514; //16

        int d1 =0; //10
        int d2 =0_0; //8
        int d3 =0b0; //2
        int d4 =0x0; //16

        long e1 =1234567890493049304L; //10
        long e2 =0_726746425; //8
        long e3 =0b111_010_110_111_100_110_100_010_101; //2
        long e4 =0x75BCD15; //16

        float f1= 39439.34934093049039430F;
        float f2 = -304394.0000000002F;

        double dd1 = 5D;
        double dd2 = 5.0;

        boolean bb1 = true;
        boolean bb2 = false;

        char cc1 = 'Ǵ';
        char cc2 = 0x1F4; //16
        char cc3 = 500; //10
        char cc4 = 0b111110100; //2
        char cc5 = 0764; //8








        System.out.println(b1+" "+b2+" "+b3+" "+b4);
        System.out.println(b1+"\b "+b2+"\b "+b3+"\b "+b4+"\b ");
        System.out.println("----------------");
        System.out.println(c1+" "+c2+" "+c3+" "+c4);
        System.out.println("----------------");
        System.out.println(d1+" "+d2+" "+d3+" "+d4);
        System.out.println("----------------");
        System.out.println(e1+" "+e2+" "+e3+" "+e4);
        System.out.println("----------------");
        System.out.println(f1+" "+f2);
        System.out.println("----------------");
        System.out.println(dd1+" "+dd2);
        System.out.println("----------------");
        System.out.println(bb1+" "+bb2);
        System.out.println("----------------");
        System.out.println(cc1+" "+cc2+" "+cc3+" "+cc4+" "+cc5);
    }
}

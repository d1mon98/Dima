package itpark.lesson4;

public class Koren2 {
    public static void main(String[] args) {
        double kor = (double)koren2(625);
        System.out.println("Корень квадратный = "+ kor);
    }
        public static double koren2(double x){
        if (x<2) return x;
        double i=1;
        while (i*i<=x){
            if (i*i<=0) break;
            i++;
        }
        return --i;
    }

}

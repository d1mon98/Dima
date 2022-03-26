package itpark.lesson4;

public class ThernarOperatorRunner {

    public static void main(String[] args) {
        System.out.println(abs(25));
        System.out.println(abs(-13));
    }

    public static int abs(int value) {
        int result = value >= 0 ? value : -value;
        return result;
    }
}
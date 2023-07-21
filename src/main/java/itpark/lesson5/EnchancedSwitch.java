package itpark.lesson5;

public class EnchancedSwitch {
    public static void main(String[] args) {
        int color = 5;
        char index = switch (color) {
            case 1 -> 33+44+22+334;
            case 2 -> '3';
            case 3 -> '3';
            case 4 -> '4';
            case 5 -> 5;
            case 6 -> '7';
            case 7 -> '8';
            default -> 0;
        };
        System.out.println(index);
    }
}

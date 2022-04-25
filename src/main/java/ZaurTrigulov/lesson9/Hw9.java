package ZaurTrigulov.lesson9;

public class Hw9 {

    public static void print() {
        String s1 = new String("я существую"); // переменные s1, s2 являются local variables и не
        String s2 = new String("я существую!!"); // существуют вне метода
        System.out.println(s1 + ", " + s2);
    } // s1 и s2 умирают на этой строке

    public static void main(String[] args) {
        Hw9 hw1 = new Hw9();
        print();
        print();
        String s1 = new String("Я жив1");
        print();
    }  // на этой послденей строке метода main "умерли" все объекты метода print(), а объекты hw1 и s1 живы и умрут
       //  этой строке, где метод main() уже окончился
}

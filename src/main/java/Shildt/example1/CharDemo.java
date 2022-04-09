package Shildt.example1;

// продемонстрировать применение типа данных char
public class CharDemo {
    public static void main(String[] args) {
        char ch1, ch2;

        ch1 = 88;
        ch2 = 'Y';

        System.out.print("ch1 и ch2: ");
        System.out.println(ch1 + " " + ch2);
        System.out.println("ch1 представляет собой: " + ch1);

// симовольные переменные ведут себя как целочисленные значения
        int i;
        for (i = 1; i <= 1000; i++) {
            ch1++; //увеличение переменной ch1 на единицу
            System.out.println("После инкрементации на 1 переменная char ch1 представляет собой: " + ch1);
        }
    }

}

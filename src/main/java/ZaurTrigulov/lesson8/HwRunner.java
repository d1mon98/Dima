package ZaurTrigulov.lesson8;

public class HwRunner {
    public static void main(String[] args) {
        System.out.println(Hw.multiply(32.44, 4, 5));
        System.out.println(Hw.multiply(5.4, 4.1, 2.01));
        System.out.println("----------------------------------------------------------------------------------------------");
        Hw.divisionWithReminder(20, 3);
        System.out.println("----------------------------------------------------------------------------------------------");
        Hw.circumference(10);
        Hw hw1 = new Hw();
        hw1.circleArea(10);
        hw1.result(10);

    }
}

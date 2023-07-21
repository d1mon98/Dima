package ZaurTrigulov.lesson5;

public class Car2 {

    Car2(String cvet, String motor) {
        System.out.println("Цвет машины: " + cvet + ", мотор машины " + motor);

    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2("yellow", "R6");
        Car2 c2 = new Car2("black", "V6");

    }
}

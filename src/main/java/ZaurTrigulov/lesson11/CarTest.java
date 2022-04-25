package ZaurTrigulov.lesson11;

import static ZaurTrigulov.lesson11.Car.changeColour;

public class CarTest {

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car c1 = new Car("red", "R4", 4);
        Car c2 = new Car("white", "v6", 2);

        c1.showInfo();
        c2.showInfo();

        // changing door Q-ty:
        System.out.println("----------------------------------------------");
        c1.chageDoorQty(c1, 444);
        c2.chageDoorQty(c2,555);
        c1.showInfo();
        c2.showInfo();

        // changing car colours:
        changeColour(c1, c2);

        System.out.println("----------------------------------------------");
        c1.showInfo();
        c2.showInfo();

    }

}



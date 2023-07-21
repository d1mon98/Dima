package ZaurTrigulov.Homework.lesson11;

public class Car {
    public Car(String color, String engine, int doorsQuantity) {
        this.color = color;
        this.engine = engine;
        this.doorsQuantity = doorsQuantity;
    }


    String color, engine;
    int doorsQuantity;

}

class CarTest {

    static void changeDoorQuantity(Car c1, int newDoorQuantity) {
        c1.doorsQuantity = newDoorQuantity;

    }

    static void changeCarColor(Car c1, Car c2) {
        String color = c2.color;
        c2.color = c1.color;
        c1.color = color;

    }

    public static void main(String[] args) {

        Car c1 = new Car("silver", "r4", 4);
        Car c2 = new Car("black", "r6", 4);
        System.out.println(c1.doorsQuantity);
        System.out.println("-----------------------------------------------");
        changeDoorQuantity(c1, 2);
        System.out.println(c1.doorsQuantity);

        System.out.println();
        System.out.println();

        System.out.println(c1.color);
        System.out.println(c2.color);
        changeCarColor(c1, c2);
        System.out.println("-----------------------------------------------");
        System.out.println(c1.color);
        System.out.println(c2.color);

    }

}

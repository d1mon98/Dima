package ZaurTrigulov.lesson11;

public class Car {
    String colour;
    String enigne;
    int doorQty;

    public Car(String colour, String enigne, int doorQty) {
        this.colour = colour;
        this.enigne = enigne;
        this.doorQty = doorQty;
    }

    public void chageDoorQty(Car c, int doorQty)
    {
        c.doorQty = doorQty;
    }

    public static void changeColour(Car car1, Car car2){
        String colour = car1.colour;
        car1.colour =car2.colour;
        car2.colour = colour;
    }

    public void showInfo() {
        System.out.println("Цвет - " + colour + ", мотор " + enigne + ", кол-во дверей - " + doorQty);
    }
}

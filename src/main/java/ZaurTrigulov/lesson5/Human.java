package ZaurTrigulov.lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info() {
        System.out.println("Name: " + name + " цвет машины: " + car.color + " баланс банковского " +
                "счета " + bA.balance);

    }

}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red", "V8");
        h.bA = new BankAccount(18,200.5);
        h.info();
    }
}

class Car3 {

    Car3(String c, String e) {
        color = c;
        engine = e;

    }

    String color;
    String engine;

}

class BankAccount {

    BankAccount(int id2, double banacle2) {
        id = id2;
        balance = banacle2;
    }

    int id;
    double balance;

}

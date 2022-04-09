package itpark.lesson7;

public class AnimalRunner {
    public static void main(String[] args) {

        /* objects */
        Animal cat = new Animal();
        cat.name = "Cat";
        cat.nickname = "Kisa";
        cat.run = 0;
        cat.maxrun = 200;
        cat.swim = 0;
        cat.maxswim = 0;

        Animal dog = new Animal();
        dog.name = "Dog";
        dog.nickname = "Rijik";
        dog.run = 0;
        dog.maxrun = 500;
        dog.swim = 5;
        dog.maxswim = 10;

        Animal tiger = new Animal();
        tiger.name = "Tiger";
        tiger.nickname = "Sherhan";
        tiger.run = 0;
        tiger.maxrun = 1000;
        tiger.swim = 20;
        tiger.maxswim = 200;

        /*methods realisation*/

        cat.runAnimals();
        dog.runAnimals();
        tiger.runAnimals();

        cat.swimAnimals();
        dog.swimAnimals();
        tiger.swimAnimals();

    }
}

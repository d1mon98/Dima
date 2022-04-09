package itpark.lesson8;

public class AnimalsRunner {
    public static void main(String[] args) {
        Animals cat = new Animals("Cat", "Meow");
        Animals dog = new Animals("Dog","Wof-Wof");
        Animals elephant = new Animals("Elephant", "Zuu-Zuu!");

        cat.voice();
        dog.voice();
        elephant.voice();
    }

}

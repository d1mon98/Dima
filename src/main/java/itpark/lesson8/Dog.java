package itpark.lesson8;

public class Dog extends Animals {

    private static final String DOG_CATEGORY = "Собака";

    public Dog() {
        super(DOG_CATEGORY);
    }

    @Override
    public void voice() {
        System.out.println(this.name + "у меет гавкать");

    }
}

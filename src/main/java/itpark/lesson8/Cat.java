package itpark.lesson8;

//класс наследник
public class Cat extends Animals {

    private static final String CAT_CATEGORY = "Кошка";

    public Cat() {
        super(CAT_CATEGORY);
    }

// имплементация абстрактного метода
    @Override
    public void voice() {
        System.out.println(this.name + " умеет мяукать");
    }
}
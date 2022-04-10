package itpark.lesson8;

public class Cow extends Animals {
    //константа, которая будет использоваться в наследуемом классе
    private static final String COW_CATEGORY = "Корова";

    public Cow() {
        super(COW_CATEGORY);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " умеет мычать");

    }
}

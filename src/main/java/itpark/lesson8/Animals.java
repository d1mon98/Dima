package itpark.lesson8;

public abstract class Animals {

    //аттрибуты класса
    protected final String name;

    // конструктор
    public Animals(String name) {
        this.name = name;
    }
    // метод voice
    public abstract void  voice();
}
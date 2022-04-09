package itpark.lesson8;

public class Animals {

    String name;
    String voice;

    //параметризированный конструктор
    Animals(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    //метод подачи жимотым звука voice

    void voice() {
        System.out.println(this.name + " говорит " + this.voice);;
    }

}

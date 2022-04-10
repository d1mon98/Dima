package itpark.lesson8.starter;

import itpark.lesson8.Animals;
import itpark.lesson8.Cat;
import itpark.lesson8.Cow;
import itpark.lesson8.Dog;

public class AnimalRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        //объединение объектов в один массив
        Animals[] animals = new Animals[] {cat, dog, cow};

        /* цикл for-each, использутся для обработки всех элеметов массива или коллекции
        синтаксис:
        for (type itVar:array)
        {
        Блок операторов;
        }
        , где - type тип итерационной меременной, совпадает с типом данных в массиве
        itVar - её имя, array - массивж
        */
        for (Animals iteracionnayaPeremennaya_luboeZnachenie : animals
        ) {
            iteracionnayaPeremennaya_luboeZnachenie.voice();

        }
    }
}

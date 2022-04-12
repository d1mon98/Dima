package Shildt.example2;
/*В данном примере конструкторы определяются в классе Box для инициализации размеров
 * параллелепипеда тремя разными способами*/

public class Box {
    double width;
    double height;
    double depth;

    // в этом конструкторе в качестве параметров используется объект типа Box (Box ob)
    // { // передать оъект конструктору
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, используемый, когда указываются все три размера
    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Box() {
        width = -1; // использовать значение -1 для оьозначения неинициализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    // конструктор используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //метод рассчета и вывода объема
    double volume() {
        return width * height * depth;
    }

}

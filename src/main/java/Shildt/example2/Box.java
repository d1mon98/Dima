package Shildt.example2;

public class Box {
    double width;
    double height;
    double depth;

    //параметризированный конструктор класса Box()
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //метод рассчета и вывода объема
    double volume() {
        return width * height * depth;
    }

}

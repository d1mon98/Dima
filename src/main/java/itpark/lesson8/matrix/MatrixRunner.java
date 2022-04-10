package itpark.lesson8.matrix;

public class MatrixRunner {
    public static void main(String[] args) {
        Matrix matrixA = new Matrix();
        matrixA.fill();
        System.out.println("Матрица А имеет вид:");
        matrixA.print();

        System.out.println("--------------------");

        Matrix matrixB = new Matrix();
        matrixB.fill();
        System.out.println("Матрица B имеет вид:");
        matrixB.print();

        System.out.println("--------------------");

        Matrix matrixC = matrixA.sum(matrixB);
        System.out.println("Сумма матриц А и B иммет вид: ");
        matrixC.print();

        System.out.println("--------------------");

        Matrix matrixD = matrixA.sub(matrixB);
        System.out.println("Разность матриц А и B иммет вид: ");
        matrixD.print();

        System.out.println("--------------------");

        int koefficient = 5;
        Matrix matrixE = matrixA.mult(koefficient);
        System.out.printf("Умножение матрицы А на коэффициент %d имеет вид: \n",koefficient);
        matrixE.print();

        System.out.println("--------------------");

        System.out.println("Единичная матрица, созданая на базе матрицы А имеет вид: ");
        matrixA.single().print();

        int dimension = 6;
        System.out.println("--------------------");
        System.out.printf("Единичная матрица, размерности %d имеет вид: \n", dimension);
        Matrix.singe(dimension).print();

        System.out.println("--------------------");
        System.out.printf("Определитель матрицы А имеет значение: %f\n", matrixA.determinant());

        System.out.println("--------------------");
        System.out.printf("Определитель матрицы B имеет значение: %f\n", Matrix.determinant(matrixB));

        System.out.println("--------------------");
        System.out.println("Матрица, являющаяся транспонированной по отношению к мартице А, иммет вид:");
        Matrix transpon = matrixA.transpon();
        transpon.print();

        System.out.println("--------------------");
        System.out.println("Матрица, являющаяся обратной по отношению к мартице А, иммет вид:");
        Matrix invert = matrixA.invert();
        invert.print();


    }
}

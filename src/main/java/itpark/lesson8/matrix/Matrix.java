package itpark.lesson8.matrix;

import java.util.Random;

public class Matrix {

    /**
     * Верхняя граница при генерации значений массива матрицы (не включая)
     */
    private static final int MAXIMUM = 10;

    //параметр - массив
    private final int m;
    private final int n;
    private double[][] array;


    //конструктор перегруженной матрицы
    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        this.array = new double[m][n];
    }

    // этот конструктор сделан на основании вышеуказанного перегруженного конструктора,
    // слово this адресуется к вышеуказанному конструктору
    public Matrix() {
        this(2, 2);
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    //метод для наполненеия матрицы
    public void fill() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(MAXIMUM);
            }
        }
    }

    private void fill(double[][] values) {
        if (this.m != values.length || this.n != values[0].length) {
            //noop
            return;
        }
        this.array = values;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //метод сложения двух матриц ( на входе метода новая матрица Matrix matrix
    public Matrix sum(Matrix matrix) {
        if (this.m != matrix.m || this.n != matrix.n) {
            return new Matrix();
        }
        Matrix result = new Matrix(this.m, this.n);
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                result.array[i][j] = this.array[i][j] + matrix.array[i][j];
            }

        }
        return result;
    }

    //метод вычитания двух матриц ( на входе метода новая матрица Matrix matrix
    public Matrix sub(Matrix matrix) {
        if (this.m != matrix.m || this.n != matrix.n) {
            return new Matrix();
        }
        Matrix result = new Matrix(this.m, this.n);
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                result.array[i][j] = this.array[i][j] - matrix.array[i][j];
            }

        }
        return result;
    }

    //метод умножения матрицы на число ( на входе метода новая матрица Matrix matrix
    public Matrix mult(int koefficient) {
        Matrix result = new Matrix(this.m, this.n);
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                result.array[i][j] = koefficient * this.array[i][j];
            }

        }
        return result;
    }

    // динамический метод создания еденичной матрицы - по диагонали стоят единицы
    public Matrix single() {
        if (this.m != this.n) {
            return new Matrix().single();
        }
        Matrix result = new Matrix(this.m, this.n);
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                result.array[i][j] = i == j ? 1 : 0;
            }
        }
        return result;
    }

    // статичный метод создания единичной матрицы
    public static Matrix singe(int dimension) {
        Matrix result = new Matrix(dimension, dimension);
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                result.array[i][j] = i == j ? 1 : 0;
            }
        }
        return result;
    }

    // еще один динамический метод создания еденичной матрицы - по диагонали стоят единицы
    public static Matrix singe2(int dimension) {
        return new Matrix(dimension, dimension).single();
    }

    // вычисление детерменаната матрицы
    public double determinant() {
        if (this.m != 2 && this.n != 2) {
            return Integer.MIN_VALUE;
        }
        return this.array[0][0] * this.array[1][1] - this.array[0][1] * this.array[1][0];
    }

    public static double determinant(Matrix matrix) {
        return matrix.determinant();
    }

    public Matrix transpon() {
        Matrix result = new Matrix(this.m, this.n);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result.array[i][j] = this.array[j][i];
            }
        }
        return result;
    }

    public Matrix invert() {
        double determinant = this.determinant();
        Matrix matrix = new Matrix();
        if (this.m != 2 && this.n != 2) {
            return matrix;
        }
        matrix.fill(new double[][]{
                        {array[1][1] / determinant, -array[0][1] / determinant},
                {-array[1][0] / determinant, array[0][0] / determinant}
    });
        return matrix;
    }
}
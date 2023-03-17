import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;
    public static int[][] colors = new int[SIZE][SIZE];

    public static void main(String[] args) {
        // заполняем сразу исходную матрицу
        createMatrix(colors);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("На сколько вы хотите повернуть матрицу?");
            System.out.println("1 -> 90 градусов");
            System.out.println("2 -> 180 градусов");
            System.out.println("3 -> 270 градусов");
            System.out.println("end ----> выйти");

            String input = sc.next();

            if (input.equals("end")) {
                break;
            } else {
                int operation = Integer.parseInt(input);

                switch (operation) {
                    case 1:
                        reply(90);
                        break;
                    case 2:
                        reply(180);
                        break;
                    case 3:
                        reply(270);
                        break;
                }
            }
        }
    }

    // вывод матриц
    public static void reply(int degree) {
        int[][] rotateMatrix = rotateMatrix(colors, degree);
        System.out.println("Исходная матрица:");
        outputMatrix(colors);

        System.out.println("Повернутая матрица:");
        outputMatrix(rotateMatrix);
    }

    // Заполнение матриц рандомными числами
    public static void createMatrix(int[][] m) {
        Random rn = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                m[i][j] = rn.nextInt(256);
            }
        }
    }

    // Вывод матрицы
    public static void outputMatrix(int[][] m) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%6d", m[i][j]);
            }
            System.out.println();
        }
    }

    // Поворот матрицы в записимости от градуса
    public static int[][] rotateMatrix(int[][] mainMatrix, int degree) {
        int[][] newMatrix = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (degree == 90) {
                    newMatrix[j][SIZE - 1 - i] = mainMatrix[i][j];
                } else if (degree == 180) {
                    newMatrix[SIZE - 1 - i][SIZE - 1 - j] = mainMatrix[i][j];
                } else if (degree == 270) {
                    newMatrix[SIZE - 1 - j][i] = mainMatrix[i][j];
                }
            }
        }
        return newMatrix;
    }
}


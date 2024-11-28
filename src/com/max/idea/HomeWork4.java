package com.max.idea;


import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
    int [][] newMatrix = newMatrix();
    prntMatrix(newMatrix);
    prntFirstLine(newMatrix);

    }

    public static int [][] newMatrix() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите количество столбцов");
           int x = scanner.nextInt();
            if (x > 0) {
                while (true) {
                    System.out.println("Введите количество строк");
                    int y = scanner.nextInt();
                    if (y > 0) {
                        int[][] matrix = new int[x][y];
                        for (int i = 0; i <= matrix.length - 1; i++) {
                            for (int j = 0; j <= matrix[i].length - 1; j++) {
                                System.out.println("Введите элемент матрицы: " + (i + 1) + " строка " + (j + 1) + " cтолбец");
                                matrix[i][j] = scanner.nextInt();
                            }
                        }
                        return matrix;


                    } else System.out.println("Введите корректное число");
                }
            } else System.out.println("Введите корректное число");
        }

    }

    public static void prntMatrix(int[][] matrix) {
        System.out.println("Ваш матрица");
        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y + " | ");
            }
            System.out.println(); // переход на новую строку после каждой строки массива }
        }
    }
    public static void prntFirstLine(int [][] matrix)
    {
        System.out.println("Первая строка матрицы, где каждый элемент умножен на 3");
        int i=0;
        for (int j=0; j<= matrix.length-1;j++)
        {
            System.out.print((matrix[i][j]*3) + " ");
        }
    }
}

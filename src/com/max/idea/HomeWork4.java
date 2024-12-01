package com.max.idea;


import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int x = getValidInput(scanner,"Введите кол-во строк");
    int y = getValidInput(scanner,"Введите кол-во столбцов");
    int [][] newMatrix = inputValueMatrix(new int[x][y],scanner);
    prntMatrix(newMatrix); //Проверка правильности матрицы матрицы
    prntFirstLine(newMatrix);

    }

    public static int [][] inputValueMatrix(int [][] matrix,Scanner scanner) {

        for (int i = 0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                System.out.println("Введите элемент матрицы: " + (i + 1) + " строка " + (j + 1) + " cтолбец");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }


    public static void prntMatrix(int[][] matrix) {
        System.out.println("Ваш матрица");
        for (int i = 0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){

                System.out.printf(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }
    public static void prntFirstLine(int [][] matrix)
    {
        System.out.println("Первая строка матрицы, где каждый элемент умножен на 3");
        int i=0;
        for (int j=0; j< matrix[i].length;j++)
        {
            System.out.print((matrix[i][j]*3) + " ");
        }
    }
    public static int getValidInput(Scanner scanner, String text) {
        int number;
        while (true) {
            System.out.println(text);
            number = scanner.nextInt();
            if (number > 0) {
                break;
            } else {
                System.out.println("Введите корректное число");
            }
        }
        return number;
    }
}

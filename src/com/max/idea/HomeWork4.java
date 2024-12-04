package com.max.idea;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        String boje1 = inputValue();
        printSolution(boje1);
    }

    public static String inputValue() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите уравнение");
            String equation = scanner.nextLine().toLowerCase();
            char[] chrArray = equation.toCharArray();
            if (((equation.indexOf('+') == 1 || equation.indexOf('-') == 1)) && (equation.indexOf('=') == 3)
                    && (((Character.isDigit(chrArray[0]) && Character.isDigit(chrArray[4]))
                    || (Character.isDigit(chrArray[0]) && Character.isDigit(chrArray[2]))
                    || (Character.isDigit(chrArray[2]) && Character.isDigit(chrArray[4])))
                    && (equation.indexOf('x') == 0 || equation.indexOf('x') == 2 || equation.indexOf('x') == 4))) {
                return equation;
            } else {
                System.out.println("вы ввели: " + equation);
                System.out.println("Введенное уравнение с поиском переменной X неверно или не доступно к решению, повторить снова");
            }
        }
    }

    public static void printSolution(String equation) {
        char[] chrArray = equation.toCharArray();
        int ax = equation.indexOf('x');
        int solution;

        if (chrArray[1] == '+') solution = switch (ax) {
            case 0 -> Character.getNumericValue(chrArray[4]) - Character.getNumericValue(chrArray[2]);
            case 2 -> Character.getNumericValue(chrArray[4]) - Character.getNumericValue(chrArray[0]);
            default -> Character.getNumericValue(chrArray[0]) + Character.getNumericValue(chrArray[2]);
        };
        else {
            solution = switch (ax) {
                case 0 -> Character.getNumericValue(chrArray[4]) + Character.getNumericValue(chrArray[2]);
                case 2 -> Character.getNumericValue(chrArray[4]) + Character.getNumericValue(chrArray[0]);
                default -> Character.getNumericValue(chrArray[0]) - Character.getNumericValue(chrArray[2]);
            };
        }

        System.out.println(solution);
    }
}

package com.max.idea;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        double num1, num2;
        String symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        num1 = scanner.nextDouble();
        System.out.println("Введите символ математической операции");
        symbol = scanner.next();
        System.out.println("Введите второе число");
        num2 = scanner.nextDouble();
        calculator(num1,num2,symbol);


    }
    public static void calculator(double num1, double num2, String symbol) {

        double calculator;
        switch (symbol) {
            case "+":
                calculator = num1 + num2;
                System.out.println("Сумма чисел равна: " + calculator);
                break;
            case "-":
                calculator = num1 - num2;
                System.out.println("Разность чисел равна: " + calculator);
                break;
            case "*":
                calculator = num1 * num2;
                System.out.println("Произведение чисел равно: " + calculator);
                break;
            case "/":
                calculator = num1 / num2;
                System.out.println("Частное чисел равно: " + calculator);
                break;
            default:

                System.out.println("Введенный символ не является математическим оператором");
        }
    }
}
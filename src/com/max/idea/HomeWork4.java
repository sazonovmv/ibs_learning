package com.max.idea;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        double num1, num2;
        String symbol;
        Scanner scanner = new Scanner(System.in);
        double x, y, z;
        System.out.println("Введите первое число");
        x = scanner.nextDouble();
        System.out.println("Введите второе число");
        y = scanner.nextDouble();
        System.out.println("Введите третье число");
        z = scanner.nextDouble();
        double avg = (x + y + z) / 3;
        System.out.println("Среднее арифмитическое = " + avg);
        double newValue = (avg / 2) - ((avg / 2) % 1); //Если только операторами
        double newValue2 = (int) (avg / 2); // Или проще так
        double newValue3 = Math.floor(avg / 2); //Или так
        if (newValue==newValue2 && newValue2==newValue3)
        {
            System.out.println("Все круто");
        }

        if (newValue > 3) { // Можно взять любой из "newValue(n)" использую этот
            System.out.println("Программа выполнена корректно");
        }
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

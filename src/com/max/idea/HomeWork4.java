package com.max.idea;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        String firstNumber = scanner.nextLine();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        if (Integer.parseInt(firstNumber) > secondNumber)
        {
            System.out.println(Double.parseDouble(firstNumber));

        }
        else if (Integer.parseInt(firstNumber) < secondNumber)
        {
            double newSecondNumber = (double) secondNumber;
            System.out.println(newSecondNumber);
        }
        else if (Integer.parseInt(firstNumber) == secondNumber)
        {
            System.out.println("Числа равны");
        }
    }
}

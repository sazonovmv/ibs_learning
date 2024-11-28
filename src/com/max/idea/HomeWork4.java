package com.max.idea;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое положительное целое число");
        int number = scanner.nextInt();
        factorialNumber(number);
    }

    public static void factorialNumber(int number) {
        int sum = 0;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i%2==0)
                    continue;
                sum = sum + i;
            }
            System.out.println(sum);
        } else {
            System.out.println("Вы ввели неподходящее число");
        }
    }
}

package com.max.idea;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {


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
            System.out.println("Все круто, это число: " + newValue);
        }
        else
        {
            System.out.println("Что то не так");
        }
        if (newValue > 3) { // Можно взять любой из "newValue(n)" использую этот
            System.out.println("Программа выполнена корректно");
        }

    }
}

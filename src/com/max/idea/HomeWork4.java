package com.max.idea;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс: 1 USD to RUB");
        Double usd = scanner.nextDouble();
        System.out.println("Введите сумму рублей к переводу");
        Double rubCount = scanner.nextDouble();
        double sum = rubCount/usd;
        sum = Math.ceil (sum * 100.0) / 100.0;
        System.out.println(sum);
    }
}

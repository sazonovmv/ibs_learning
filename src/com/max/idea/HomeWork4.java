package com.max.idea;


import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку!");
        String example = scanner.nextLine();
        while(!example.matches("[a-zA-Z ]+")) {
            System.out.println("Строка состоит не только из латиницы, повторите ввод");
            example = scanner.nextLine();
        }
        String [] result = example.split(" ");
        System.out.println(result.length);
    }
}
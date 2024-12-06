package com.max.idea;


import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку!");
        String example = scanner.nextLine();
        String [] result = example.split(" ");
        int wordCount = 0; 
        for (String word : result) 
        { 
            if (word.matches("[а-яА-Я]+")) 
            { 
                wordCount++;} 
            } 
        System.out.println("Количество слов, содержащих только кириллицу: " + wordCount);
    }
}

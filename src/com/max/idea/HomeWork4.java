package com.max.idea;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        while (count!=3) {
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Подсказка") && count == 0)
            {
                System.out.println("Это связано с компьютерной техникой и болезнями человека");

            }
            else if (answer.equalsIgnoreCase("Подсказка") && count > 0)
            {
                System.out.println("Подсказка недоступна");

            }
            else if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            }
            else if(!answer.equalsIgnoreCase("Заархивированный вирус"))

            {
                count++;
               if (count <3)
               {
                   System.out.println("Подумай еще!");
               }
               else {

                   System.out.println("Обидно, приходи в другой раз");
               }
            }

        }


    }


}

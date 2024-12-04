package com.max.idea;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int count = scanner.nextInt();
        Scanner scannerString = new Scanner(System.in);
        String[] lines = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Введите значение строки");
            lines[i] = scannerString.nextLine();
        }
        System.out.println(lines[countSameElements(lines)]);
    }

    public static int countSameElements(String[] array) {
        int maxValue = 0;
        int maxValueString = 0;

        for (int i = 0; i < array.length; i++) {
            int uniqueCount = 0;
            char[] chrArray = array[i].toCharArray();

            for (int j = 0; j < chrArray.length; j++) {
                boolean isUnique = true;

                for (int k = j + 1; k < chrArray.length; k++) {
                    if (chrArray[j] == chrArray[k]) {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique) {
                    uniqueCount++;
                }
            }

            if (maxValue < uniqueCount) {
                maxValue = uniqueCount;
                maxValueString = i;
            }
        }

        return maxValueString;
    }

}

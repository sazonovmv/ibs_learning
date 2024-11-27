package com.max.idea;


import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        final int x,y,z;
        x = 1;
        y = 4;
        z = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrayLenth = scanner.nextInt();
        int [] array = fullArray(new int[arrayLenth]);
        //printArray(array); - првоерка корректности
        findElement(array,x,y,z);
    }

    public static int [] fullArray(int [] emptyArray)
    {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i <= emptyArray.length-1;i++)
        {
            System.out.println("Введите значение элемента массива");
            emptyArray[i] = scanner.nextInt();
        }
        return emptyArray;
    }
//    public static void printArray(int [] array)
//    {
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//
//    }
    public static void findElement(int [] array, int x, int y, int z)
    {
        for (int i : array) {
            if (array[i]==x | array[i]==y | array[i]==z)
            {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
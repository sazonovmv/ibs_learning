package com.max.idea;


import java.util.Random;


public class HomeWork4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-20, 20);
        }
        findMinMax(array);
    }
    public static void findMinMax(int [] array)
    {
        int min, max;
        max = array[0];
        min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i + 1]) {
                max = array[i + 1];

            } else if (min > array[i + 1]) {
                min = array[i + 1];

            }
        }
        System.out.println(max + " - Максимальный элемент массива");
        System.out.println(min + " - Минимальный элемент массива");
        for (int Array : array) {
            System.out.print("| " + Array);
        }
        System.out.println();
        if (Math.abs(max)>Math.abs(min))
        {
            System.out.println("Наибольшее число по модулю = " + Math.abs(max));
        }
        else if ((Math.abs(max)<Math.abs(min)))
        {
            System.out.println("Наибольшее число по модулю = " + Math.abs(min));
        }
        else if ((Math.abs(max)==Math.abs(min)))
        {
            System.out.println("Значения по модулю равны");
        }
    }

}


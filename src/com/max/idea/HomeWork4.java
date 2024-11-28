package com.max.idea;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите размер массива");
            int lenghtArray = scanner.nextInt();
            if (lenghtArray<=0)
            {
                System.out.println("Вы ввели не корректное число(Число должно быть больше нуля) - Введите другое число");
            }
            else
            {
                double [] array = fullArray(new double[lenghtArray]);
                System.out.println("Среднее арифмитическое массива= " + arrayAvg(array));
                double avg = arrayAvg(array);
                prntArray(array,avg);
                break;
            }
        }

    }
    public static double [] fullArray(double [] emptyArray)
    {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i <= emptyArray.length-1;i++)
        {
            System.out.println("Введите значение элемента массива номер: " + (i+1));
            emptyArray[i] = scanner.nextDouble();
        }
        return emptyArray;
    }

    public static double arrayAvg(double [] array)
    {
        double avg=0;
        for (double Arrays : array)
        {
           avg = avg + Arrays;
        }
        avg = avg/array.length;
        return avg;

    }
public static void prntArray(double [] array, double avg)
{
    System.out.println("Новый массив: ");
    for (double i : array)
    {
        System.out.print((i*avg) + " ");
    }
}

}

package com.max.idea;
import java.util.Random;
public class Main {
    public static void main(String[] args) {



        int [] array = rndArray(new int[5]);
        printArray(array);
        System.out.println(" - Это массив");
        Swap(array);
        printArray(array);
        System.out.println(" - Это массив после смены местами первого и последнего элемента");
        prntSum(array);
        System.out.print(" - Это сумма чисел 1 и 3 элемента массива");

    }
    public static int [] rndArray(int [] array)
    {

        Random rand = new Random();
        for (int i=0;i<array.length;i++)
        {
            array[i] = rand.nextInt(99);
        }
             return array;
    }
    public static void printArray(int [] array)
    {
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void Swap(int [] arrayToSwap)
    {
        int elmSwap = arrayToSwap[0];
        arrayToSwap[0] = arrayToSwap[arrayToSwap.length-1];
        arrayToSwap[arrayToSwap.length-1] = elmSwap;
    }


    public static void prntSum(int [] arrayToSum)
    {
        int sum = arrayToSum[0]+arrayToSum[arrayToSum.length/2];
        System.out.print(arrayToSum[0] + "+" + arrayToSum[arrayToSum.length/2] + "=" + sum);
    }

}

package com.max.idea;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        int arrayLenght = 5;
        int [] array = new int[arrayLenght];
        array = rndArray(arrayLenght);
        prntArray(array);
        System.out.println(" - Это массив");
        elmSwap(array);
        prntArray(array);
        System.out.println(" - Это массив после смены местами первого и последнего элемента");
        System.out.println(array[0]+ " + "+ array[2]+ " = " + (array[0]+array[2]));
    }
    public static int [] rndArray(int arrayLenght)
    {
        int [] array = new int[arrayLenght];
        Random rand = new Random();
        for (int i=0;i<array.length;i++)
        {
            array[i] = rand.nextInt(99);
        }
             return array;
    }
    public static void prntArray(int [] array)
    {
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }

    }

    public static int [] elmSwap(int [] arrayToSwap)
    {
        int elmSwap = arrayToSwap[0];
        arrayToSwap[0] = arrayToSwap[4];
        arrayToSwap[4] = elmSwap;
        return arrayToSwap;
    }

}

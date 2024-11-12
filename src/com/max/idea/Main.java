package com.max.idea;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        double maxValue = rand.nextDouble();
        int minValue = Integer.MIN_VALUE;
        System.out.println(maxValue);
        System.out.println(minValue);
    }
}

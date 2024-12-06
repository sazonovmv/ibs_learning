package com.max.idea;



public class HomeWork4 {
    public static void main(String[] args) {
        String simpleString = "I like Java!!!";

        if (simpleString.contains("Java") && simpleString.startsWith("I like") && simpleString.endsWith("!!!"))
        {
            String newString =simpleString.toUpperCase();
            System.out.println(newString);
        }
        int starts = simpleString.indexOf("Java");
        simpleString = simpleString.replaceAll("a","o");
        System.out.println(simpleString.substring(starts,starts+4));

    }
}

package com.max.idea;


import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {


        String boje1 = inputValue();

        prntSolution(boje1);
    }



    public static String inputValue() {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Введите уравнение");
            String equation = scanner.nextLine();
             equation = equation.toLowerCase();
            char[] chrArray = equation.toCharArray();
            if (((equation.indexOf('+') == 1 | equation.indexOf('-') == 1)) && (equation.indexOf('=') == 3) && (((Character.isDigit(chrArray[0]) == true) & (Character.isDigit(chrArray[4]) == true)) || ((Character.isDigit(chrArray[0]) == true) & (Character.isDigit(chrArray[2]) == true)) || ((Character.isDigit(chrArray[2]) == true) & (Character.isDigit(chrArray[4]) == true))) && (equation.indexOf('x') == 0 || equation.indexOf('x') == 2 || equation.indexOf('x') == 4)) {
                return equation;
            }
            else
            {
                System.out.println("вы ввели: " + equation);
                System.out.println("Введенное уравнение с поиском переменной X неверно или не доступно к решению, повторить снова");
            }
        }

    }


    public static void prntSolution(String eqation)
    {
        char[] chrArray = eqation.toCharArray();
        int ax = eqation.indexOf('x');
        int solution;
        if (chrArray[1] == '+')
        {
            switch (ax)
            {
                case 0 :
                   solution =  chrArray[4] - chrArray[2];
                   break;
                case 2 :
                    solution =  chrArray[4] - chrArray[0];
                    break;
                default:
                    solution =  chrArray[0] + chrArray[2];
                    break;
            }
        }
        else
        {  switch (ax)
        {
            case 0 :
                solution =  chrArray[4] + chrArray[2];
                break;
            case 2 :
                solution =  chrArray[4] + chrArray[0];
                break;
            default:
                solution =  chrArray[0] - chrArray[2];
                break;
        }
        }
        System.out.println(solution);
    }
}

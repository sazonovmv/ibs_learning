package com.max.idea;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        double num1, num2;
        String symbol;
        Scanner scanner = new Scanner(System.in);
        double x, y, z;
        System.out.println("Введите первое число");
        x = scanner.nextDouble();
        System.out.println("Введите второе число");
        y = scanner.nextDouble();
        System.out.println("Введите третье число");
        z = scanner.nextDouble();
        double avg = (x + y + z) / 3;
        System.out.println("Среднее арифмитическое = " + avg);
        double newValue = (avg / 2) - ((avg / 2) % 1); //Если только операторами
        double newValue2 = (int) (avg / 2); // Или проще так
        double newValue3 = Math.floor(avg / 2); //Или так
        if (newValue==newValue2 && newValue2==newValue3)
        {
            System.out.println("Все круто, это число: " + newValue);
        }
        else
        {
            System.out.println("Что то не так");
        }
        if (newValue > 3) { // Можно взять любой из "newValue(n)" использую этот
            System.out.println("Программа выполнена корректно");
        }
        System.out.println("Введите первое число");
        num1 = scanner.nextDouble();
        System.out.println("Введите символ математической операции");
        symbol = scanner.next();
        System.out.println("Введите второе число");
        num2 = scanner.nextDouble();
        calculator(num1,num2,symbol);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        byte chooseOne = scanner.nextByte();
        switch (chooseOne){
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                        break;
            case 1 :
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция, 4 - слаг");
                        break;
            default:
                System.out.println("Вы ввели некорректное значение");
        }
        byte chooseTwo = scanner.nextByte();
        System.out.println("Введите число");
        double value = scanner.nextDouble();
        convert(chooseOne,chooseTwo,value);


    }

    public static void calculator(double num1, double num2, String symbol) {

        double calculator;
        switch (symbol) {
            case "+":
                calculator = num1 + num2;
                System.out.println("Сумма чисел равна: " + calculator);
                break;
            case "-":
                calculator = num1 - num2;
                System.out.println("Разность чисел равна: " + calculator);
                break;
            case "*":
                calculator = num1 * num2;
                System.out.println("Произведение чисел равно: " + calculator);
                break;
            case "/":
                calculator = num1 / num2;
                System.out.println("Частное чисел равно: " + calculator);
                break;
            default:

                System.out.println("Введенный символ не является математическим оператором");
        }
    }
    static public void convert(byte ChooseOne, byte ChooseTwo, double value)
    {
        double conValue1, conValue2, conValue3;
        String nameValeDist1 = "Метры: ";
        String nameValeDist2 = "Мили: ";
        String nameValeDist3 = "Ярды: ";
        String nameValeDist4 = "Футы: ";
        String nameValeWeight1 = "Килограммы: ";
        String nameValeWeight2 = "Фунты: ";
        String nameValeWeight3 = "Унции: ";
        String nameValeWeight4 = "Слаги: ";
        if (ChooseOne == 2 )
        {
            if (ChooseTwo == 1) {
                conValue1 = value * 0.000621;
                conValue2 = value * 1.093;
                conValue3 = value * 3.28084;
                System.out.println(nameValeDist2 + conValue1);
                System.out.println(nameValeDist3 + conValue2);
                System.out.println(nameValeDist4 + conValue3);
            }
            else if (ChooseTwo == 2)
            {
                conValue1 = value * 1609.344;
                conValue2 = value * 1760;
                conValue3 = value * 5280;
                System.out.println(nameValeDist1 + conValue1);
                System.out.println(nameValeDist3 + conValue2);
                System.out.println(nameValeDist4 + conValue3);
            }
            else if (ChooseTwo == 3)
            {
                conValue1 = value * 0.9144;
                conValue2 = value * 0.00056;
                conValue3 = value * 3;
                System.out.println(nameValeDist1 + conValue1);
                System.out.println(nameValeDist2 + conValue2);
                System.out.println(nameValeDist4 + conValue3);
            }
            else if (ChooseTwo == 4)
            {
                conValue1 = value * 0.3048;
                conValue2 = value * 0.0001894;
                conValue3 = value * 0.3;
                System.out.println(nameValeDist1 + conValue1);
                System.out.println(nameValeDist2 + conValue2);
                System.out.println(nameValeDist3 + conValue3);
            }
        } else if (ChooseOne == 1) {

            if (ChooseTwo == 1) {
                conValue1 = value * 0.45359237;
                conValue2 = value * 35.27;
                conValue3 = value * 0.068;
                System.out.println(nameValeWeight2 + conValue1);
                System.out.println(nameValeWeight3 + conValue2);
                System.out.println(nameValeWeight4 + conValue3);
            }
            else if (ChooseTwo == 2)
            {
                conValue1 = value * 0.453592;
                conValue2 = value * 16;
                conValue3 = value * 0.028;
                System.out.println(nameValeWeight1 + conValue1);
                System.out.println(nameValeWeight3 + conValue2);
                System.out.println(nameValeWeight4 + conValue3);
            }
            else if (ChooseTwo == 3)
            {
                conValue1 = value * 0.028;
                conValue2 = value * 0.0625;
                conValue3 = value * 0.0019;
                System.out.println(nameValeWeight1 + conValue1);
                System.out.println(nameValeWeight2 + conValue2);
                System.out.println(nameValeWeight4 + conValue3);
            }
            else if (ChooseTwo == 4)
            {
                conValue1 = value * 14.59;
                conValue2 = value * 32.17;
                conValue3 = value * 514.78;
                System.out.println(nameValeWeight1 + conValue1);
                System.out.println(nameValeWeight2 + conValue2);
                System.out.println(nameValeWeight3 + conValue3);
            }
        }
    }
}

package com.max.idea;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        byte chooseOne = scanner.nextByte();
        switch (chooseOne) {
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                break;
            case 1:
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция, 4 - слаг");
                break;
            default:
                System.out.println("Вы ввели некорректное значение");
        }
        byte chooseTwo = scanner.nextByte();
        System.out.println("Введите число");
        double value = scanner.nextDouble();
        convert(chooseOne, chooseTwo, value);


    }

    public static void convert(byte ChooseOne, byte ChooseTwo, double value) {
        double conValue1, conValue2, conValue3;
        String nameValeDist1 = "Метры: ";
        String nameValeDist2 = "Мили: ";
        String nameValeDist3 = "Ярды: ";
        String nameValeDist4 = "Футы: ";
        String nameValeWeight1 = "Килограммы: ";
        String nameValeWeight2 = "Фунты: ";
        String nameValeWeight3 = "Унции: ";
        String nameValeWeight4 = "Слаги: ";
        if (ChooseOne == 2) {
            if (ChooseTwo == 1) {
                conValue1 = value * 0.000621;
                conValue2 = value * 1.093;
                conValue3 = value * 3.28084;
                System.out.println(nameValeDist2 + conValue1);
                System.out.println(nameValeDist3 + conValue2);
                System.out.println(nameValeDist4 + conValue3);
            } else if (ChooseTwo == 2) {
                conValue1 = value * 1609.344;
                conValue2 = value * 1760;
                conValue3 = value * 5280;
                System.out.println(nameValeDist1 + conValue1);
                System.out.println(nameValeDist3 + conValue2);
                System.out.println(nameValeDist4 + conValue3);
            } else if (ChooseTwo == 3) {
                conValue1 = value * 0.9144;
                conValue2 = value * 0.00056;
                conValue3 = value * 3;
                System.out.println(nameValeDist1 + conValue1);
                System.out.println(nameValeDist2 + conValue2);
                System.out.println(nameValeDist4 + conValue3);
            } else if (ChooseTwo == 4) {
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
            } else if (ChooseTwo == 2) {
                conValue1 = value * 0.453592;
                conValue2 = value * 16;
                conValue3 = value * 0.028;
                System.out.println(nameValeWeight1 + conValue1);
                System.out.println(nameValeWeight3 + conValue2);
                System.out.println(nameValeWeight4 + conValue3);
            } else if (ChooseTwo == 3) {
                conValue1 = value * 0.028;
                conValue2 = value * 0.0625;
                conValue3 = value * 0.0019;
                System.out.println(nameValeWeight1 + conValue1);
                System.out.println(nameValeWeight2 + conValue2);
                System.out.println(nameValeWeight4 + conValue3);
            } else if (ChooseTwo == 4) {
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
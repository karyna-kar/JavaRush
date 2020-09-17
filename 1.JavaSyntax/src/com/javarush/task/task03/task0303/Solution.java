package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(25, 100.5));
        System.out.println(convertEurToUsd(50, 80.5));

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double result = eur*exchangeRate;
        return result;

    }
}

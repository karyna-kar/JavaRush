package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int result = a+b;
        return result;
    }

    public static int minus(int a, int b) {
        int result = a-b;
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a*b;
        return result;
    }

    public static double division(int a, int b) {
        double result = (double)a/b;
        return result;
    }

    public static double percent(int a, int b) {
        double result = a*((double)b/100);
        return result;
    }

    public static void main(String[] args) {

    }
}
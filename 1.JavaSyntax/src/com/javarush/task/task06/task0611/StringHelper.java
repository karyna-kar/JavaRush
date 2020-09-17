package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result=s;
        for (int i=0; i<4;i++)
        {
            result = result +s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = s;
        for (int i=0; i<count-1;i++)
        {
            result = result +s;
        }
        return result;
    }

    public static void main(String[] args) {
    }
}

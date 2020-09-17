package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        for (int j=1; j<=10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

    }
}

package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numb = reader.readLine();
        int a = Integer.parseInt(numb);

        if (a>=1 && a<=999) {
            if (numb.length() == 1 && a % 2 == 0)
                System.out.println("четное однозначное число");
            else if (numb.length() == 1 && a % 2 != 0)
                System.out.println("нечетное однозначное число");
            else if (numb.length() == 2 && a % 2 == 0)
                System.out.println("четное двузначное число");
            else if (numb.length() == 2 && a % 2 != 0)
                System.out.println("нечетное двузначное число");
            else if (numb.length() == 3 && a % 2 == 0)
                System.out.println("четное трехзначное число");
            else if (numb.length() == 3 && a % 2 != 0)
                System.out.println("нечетное трехзначное число");
        }

    }
}

package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");

    }
}

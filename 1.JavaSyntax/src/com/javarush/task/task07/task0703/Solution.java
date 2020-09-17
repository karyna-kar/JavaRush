package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Общение одиноких массивов
*/
public class Solution {
    public static int[] initializeArrays() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] rows  = new String [10];
        int [] numbers = new int [10];
        for (int i=0; i<rows.length; i++)
        {
            rows[i] = reader.readLine();
            numbers[i]=rows[i].length();
        }
        return numbers;
    }


        public static void printArray(int [] numbers) throws Exception {
        for (int i=0; i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
        }


    public static void main(String[] args) throws Exception {
        int [] numbers =  initializeArrays();
        printArray(numbers);
    }
}

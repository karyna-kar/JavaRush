package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Solution {

    public static String[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] rows = new String [10];
        for (int i=0; i<8;i++)
        {
            rows [i] = reader.readLine();
        }

        return rows;
    }

    public static void printArray(String [] rows) throws IOException {
        for (int i= rows.length-1; i>=0;i--)
        {
            System.out.println(rows[i]);
        }
    }

    public static void main(String[] args) throws Exception {

        String [] rows = initializeArray();
        printArray(rows);
    }
}
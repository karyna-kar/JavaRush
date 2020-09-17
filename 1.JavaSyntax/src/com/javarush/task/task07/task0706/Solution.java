package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
       public static void countbuildings(int [] numbers) throws Exception {
        int odd = 0;
        int even =0;
        for (int i=0; i<numbers.length; i++)
        {
            if (i%2==0)
            {
                even=even+numbers[i];
            }
            else
            {
                odd=odd+numbers[i];
            }
        }
        if (even > odd)
        {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else
        {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
    public static int[] initializeArray() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] rows = new int [15];
        for (int i=0; i<rows.length; i++)
        {
            rows[i] = Integer.parseInt(reader.readLine());
        }
        return rows;
    }
    public static void main(String[] args) throws Exception {
        int [] rows = initializeArray();
        countbuildings(rows);
    }
}

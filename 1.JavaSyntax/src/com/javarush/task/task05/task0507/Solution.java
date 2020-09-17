package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;
        int sum = 0;
        double count = 0;
        while (1==1) {
            int number = Integer.parseInt(reader.readLine());
            if (number!=-1)
            {
                sum+=number;
                count++;
            }
            else {
                result = sum/count;
                System.out.println(result);
                break;
            }
            }
        }
    }


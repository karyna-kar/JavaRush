package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int countPos=0;
        int countNeg=0;

        if (a>0)
            countPos++;
        else if (a<0)
            countNeg++;

        if (b>0)
            countPos++;
        else if (b<0)
            countNeg++;

        if (c>0)
            countPos++;
        else if (c<0)
            countNeg++;

        System.out.println("количество отрицательных чисел: " + countNeg);
        System.out.print("количество положительных чисел: " + countPos);

    }
}

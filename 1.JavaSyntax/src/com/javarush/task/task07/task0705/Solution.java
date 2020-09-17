package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static int[] initializeArrays() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int [20];
        int odd = 0;
        int even =0;
        for (int i=0; i<numbers.length; i++)
        {
            numbers[i] = Integer.parseInt(reader.readLine());
            if (i/2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        return numbers;
    }

    public static int[] copyArrays(int [] numbers) throws Exception {
        int [] numb1 = new int [10];
        for (int i=0; i<(numbers.length)/2; i++)
        {
            numb1[i] = numbers[i];
        }
        int [] numb2 = new int [10];
        int a=0;
        for (int i=(numbers.length)/2; i<numbers.length; i++)
        {
            numb2[a] = numbers[i];
            a++;
        }
        return numb2;
    }

    public static void printArray(int [] numbers) throws Exception {
        for (int i=0; i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        int [] numbers = initializeArrays();
        int [] numb2 = copyArrays(numbers);
        printArray(numb2);

    }
}

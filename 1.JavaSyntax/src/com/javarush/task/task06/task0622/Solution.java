package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static int [] sort (int [] numbers)
    {
        //сортировка вставками
        for (int i=1; i < numbers.length;i++)
        {
            int current = numbers[i];
            int j=i-1;
            while (j>=0 && current < numbers[j]){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1]=current;
        }
        return numbers;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int [5];
        for (int i=0; i<5; i++)
        {
            int numb = Integer.parseInt(reader.readLine());
            numbers[i] = numb;
        }

        int [] sorted = sort(numbers);

        for (int i=0; i<sorted.length; i++)
        {
            System.out.println(sorted[i]);
        }

    }
}

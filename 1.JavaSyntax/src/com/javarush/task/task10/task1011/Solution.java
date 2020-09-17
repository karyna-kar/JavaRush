package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        char[]letters = s.toCharArray();
        int k=0;
        for (int i=0; i<40; i++)
        {
            for(int j=k; j<letters.length; j++)
            {
                System.out.print(letters[j]);
            }
            System.out.println();
            k++;
        }
    }

}


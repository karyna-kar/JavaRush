package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //int i=0;
        int b=0;
        int c=1;
        while (b<10)
        {
            int i=0;
            int a=0;
            while (i < 10) {
                a = a + c;
                System.out.print(a +" ");
                i++;
            }
            b++;
            c++;
            a++;
            System.out.print("\n");
        }
    }
}

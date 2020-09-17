package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a==b && b!=c)
            System.out.println(a + " " + b);
        else
        {
            if (a==c && c!=b)
                System.out.println(a + " " + c);
            else
            {
                if (b==c && c!=a)
                    System.out.println(b + " " + c);
                else
                if (a==b && b==c)
                    System.out.println(a + " " + b + " " + c);
            }
        }

    }
}
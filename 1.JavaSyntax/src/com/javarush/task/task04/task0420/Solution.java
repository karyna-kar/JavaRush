package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        //abc
        if (a <= b &&  b <= c  )
            System.out.println(c + " " + b + " " + a);
            //bac
        else if (b <= a && a <= c)
            System.out.println(c + " " + a + " " + b);
            //cba
        else if (c <= b && b <= a)
            System.out.println(a + " " + b + " " + c);
            //acb
        else if (a <= c && c <= b)
            System.out.println(b + " " + c + " " + a);
            //bca
        else if (b <= c && c <= a)
            System.out.println(a + " " + c + " " + b);
            //cab
        else if (c <= a && a <= b)
            System.out.println(b + " " + a + " " + c);

    }
}

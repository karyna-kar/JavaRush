package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (1==1)
        {
            String s = reader.readLine();
            if (s.equals("сумма")){
                System.out.print(sum);
                break;}
            else
            {
                int i=Integer.parseInt(s);
                sum+=i;
            }
        }

    }
}

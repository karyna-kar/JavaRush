package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (1==1 ) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1)
            {
                sum+=number;
                System.out.println(sum);
                break;
            }
            else
            {
                sum+=number;
            }

        }


    }
}

package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even=0;
    public static int odd=0;

    static void countDigits(String number)
    {
        int numb = Integer.parseInt(number);
        for (int i=0; i<number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            if ((digit % 2) == 0) {
                even++;
            } else {
                odd++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = (reader.readLine());

        countDigits(number);

        System.out.print("Even: "+even+" Odd: " + odd);
}
}
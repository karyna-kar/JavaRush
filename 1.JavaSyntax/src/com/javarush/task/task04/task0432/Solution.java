package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String template = reader.readLine();
        int numb = Integer.parseInt(reader.readLine());

        if (numb >0)
        {
            int i=0;
            while (i<numb)
            {
                i++;
                System.out.println(template);
            }
        }

    }
}

package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String [] words = string.split(" ");
        StringBuilder outputWord = new StringBuilder();
        for (int i=0; i<words.length; i++)
        {
            char[] letters = words[i].toCharArray();
            for (int j=0; j<letters.length; j++)
            {
                if (j==0)
                {
                    outputWord.append(Character.toUpperCase(letters[0]));
                }
                else
                {
                    outputWord.append(letters[j]);
                }
            }
            outputWord.append(" ");
        }

        System.out.println(outputWord);
    }
}

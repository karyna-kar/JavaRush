package com.javarush.task.task07.task0714;

/* 
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> initializeArrays() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> rows = new ArrayList<String>();
        for (int i=0; i<5; i++)
        {
            rows.add(reader.readLine());
        }
        return  rows;
    }

    public static void printArray(ArrayList<String> rows)
    {
        for (int i = rows.size()-1; i>=0; i--)
        {
            System.out.println(rows.get(i));
        }
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> rows = initializeArrays();
        rows.remove(2);
        printArray(rows);
    }
}

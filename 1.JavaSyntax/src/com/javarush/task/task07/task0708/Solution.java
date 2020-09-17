package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static ArrayList<String>  initializeArrays() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> rows = new ArrayList<String>();
        for (int i=0; i<5; i++)
        {
            rows.add(reader.readLine());
        }
        return rows;
    }

    public static void sortArray() throws Exception {
        Collections.sort(strings, Comparator.comparing(String::length));
    }

    public static void printArray() throws Exception {
        String maxrow = strings.get(strings.size()-1);
        for (int i=0; i<strings.size();i++)
        {
            if ((strings.get(i)).length() == maxrow.length())
            {
                System.out.println(strings.get(i));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        strings = initializeArrays();
        sortArray();
        printArray();
    }
}

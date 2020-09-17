package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
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

    public static ArrayList <String> changeStructure (ArrayList <String> rows)
    {
        for (int i=0; i<13; i++)
        {
            String row = rows.get(rows.size()-1);
            rows.remove(rows.size()-1);
            rows.add(0, row);
        }
        return rows;
    }

    public static void printArray (ArrayList <String> rows)
    {
        for (int i=0; i<rows.size(); i++)
        {
            System.out.println(rows.get(i));
        }
    }

    public static void main(String[] args) throws Exception {
        ArrayList <String> rows = initializeArrays();
        printArray(changeStructure(rows));
    }
}

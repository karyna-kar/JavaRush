package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

    public static ArrayList <String> initializeArrays() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> rows = new ArrayList<String>();
        for (int i=0; i<5; i++)
        {
            rows.add(reader.readLine());
        }
        return  rows;
    }

    public static ArrayList <String> search(ArrayList <String> rows) throws Exception {
        ArrayList <String> minrows = rows;
        String min = minrows.get(0);
        Collections.sort(minrows, Comparator.comparing(String::length));
      /*  for (int i=0; i<minrows.size(); i++)
        {
           if (rows.get(i).length() < min.length())
           {
               minrows.remove(min);
               min=minrows.get(i);
           }
           else { if (rows.get(i).length() > min.length()) {
               minrows.remove(i);
           }
           else
           {
               min=minrows.get(i);
           }
           }
        }*/
            return  minrows;
    }

    public static void print(ArrayList <String> rows) throws Exception {
        String minRow = rows.get(0);
        for (int i=0; i<rows.size(); i++)
        {
            if ((rows.get(i)).length() == minRow.length())
            {
            System.out.println(rows.get(i));
            }
        }
    }
    public static void main(String[] args) throws Exception {
        ArrayList <String> rows = initializeArrays();
        ArrayList <String> minrows = search(rows);
        print(minrows);
    }
}

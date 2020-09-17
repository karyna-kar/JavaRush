package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> rows = initializeArray();
        ArrayList <String> copyRows= new ArrayList<String>(rows);
        ArrayList <String> sortedRows = sortArray(copyRows);

        for (int i=0; i<rows.size(); i++)
        {
            if (rows.get(i).length()!= sortedRows.get(i).length())
            {
                System.out.println(rows.indexOf(rows.get(i)));
                break;
            }
        }
    }
    public  static ArrayList<String> initializeArray()throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> rows = new ArrayList<String>();
        for (int i=0; i<10; i++)
        {
            rows.add(reader.readLine());
        }
        return rows;
    }

    public static ArrayList<String> sortArray(ArrayList <String> rows)throws Exception
    {
        Collections.sort(rows, Comparator.comparing(String::length));
        return rows;
    }

  /*  public static String compareArrays(ArrayList <String> rows, ArrayList <String> sortedRows)throws Exception
    {
        for (int i=0; i<rows.size(); i++)
        {
            if (rows.get(i).length()!= sortedRows.get(i).length())
        }
    }*/
}


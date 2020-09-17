package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        printArray(newArray(list));
    }

    /*public static ArrayList<String> initializeArrays() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        return list;
    }*/

    public static void printArray(ArrayList<String> rows) throws Exception
    {
        for (int i=0; i < rows.size(); i++)
        {
            System.out.println(rows.get(i));
        }
    }

    public static ArrayList<String>  newArray(ArrayList<String> rows) throws Exception
    {
        int size = rows.size();
        for (int i=0; i < size; i++)
        {
            rows.add((i*2)+1 , "именно");
        }
        return rows;
    }
}


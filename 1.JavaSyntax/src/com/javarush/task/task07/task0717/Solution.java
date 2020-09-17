package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList<String>();
        for (int i=0; i<10; i++)
        {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);
        printArray(result);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> doubledlist = new ArrayList<String>();
        for (int i=0; i<list.size();i++)
        {
            doubledlist.add(list.get(i));
            doubledlist.add(list.get(i));
        }
        return doubledlist;
    }

    public static void printArray(ArrayList<String> rows)
    {
        for (int i = 0; i<rows.size(); i++)
        {
            System.out.println(rows.get(i));
        }
    }
}

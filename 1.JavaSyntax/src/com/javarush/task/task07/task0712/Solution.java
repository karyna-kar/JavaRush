package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Самые-самые
*/

public class Solution {

    public static ArrayList<String> initializeArrays() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> rows = new ArrayList<String>();
        for (int i=0; i<10; i++)
        {
            rows.add(reader.readLine());
        }
        return  rows;
    }

    public static String searchMin(ArrayList <String> rows) throws Exception {
        Collections.sort(rows, Comparator.comparing(String::length));
        return  rows.get(0);
    }

    public static String searchMax(ArrayList <String> rows) throws Exception {
        Collections.sort(rows, Comparator.comparing(String::length));
        return  rows.get(rows.size()-1);
    }

    public static String compareMinMax(ArrayList <String> rows, String min, String max) throws Exception {
        String foundedRow = null;
        for (int i=0; i<rows.size(); i++)
        {
            if (rows.get(i).length() ==  min.length() || rows.get(i).length() == max.length())
            {
                foundedRow=rows.get(i);
                break;
            }
        }
        return foundedRow;
    }

    public static void main(String[] args) throws Exception {
        ArrayList <String> rows = initializeArrays();
        ArrayList <String> rows1 = (ArrayList) rows.clone();;
        String minRow =  searchMin(rows);
        String maxRow =  searchMax(rows);
        System.out.println(compareMinMax(rows1, minRow, maxRow));
    }
}

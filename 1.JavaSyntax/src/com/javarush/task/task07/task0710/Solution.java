package com.javarush.task.task07.task0710;

/* 
В начало списка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> rows = new ArrayList <String>();
        for (int i=0; i<10; i++)
        {
            rows.add(0, reader.readLine());
        }
        for (int i=0; i<rows.size(); i++)
        {
            System.out.println(rows.get(i));
        }
    }
}

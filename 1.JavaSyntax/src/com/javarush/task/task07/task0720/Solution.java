package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList <String> rows = new ArrayList<>();
        initialiseArray(rows, N);
        modifyArray(rows, M);
        printArray(rows);

    }

    public static void initialiseArray(ArrayList<String>rows, int N) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<N;i++)
        {
            rows.add(reader.readLine());
        }
    }
    public static void printArray(ArrayList <String> rows) throws IOException{
        for (int i=0; i<rows.size();i++)
        {
            System.out.println(rows.get(i));
        }
    }

    public static void modifyArray(ArrayList <String> rows, int M) throws IOException{
        while (M>0)
        {
            String row = rows.get(0);
            rows.remove(0);
            rows.add(row);
            M-=1;
        }
    }
}

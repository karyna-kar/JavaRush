package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.lang.management.BufferPoolMXBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readerFile = new BufferedReader(new InputStreamReader(System.in));
        String file = readerFile.readLine();
        readerFile.close();
        ArrayList<Integer> numbers = readNumbers(file);
        sortArray(numbers);


    }
    public static ArrayList<Integer> readNumbers(String file) throws IOException {
       // BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (reader.ready())
        {
            int numb = Integer.parseInt(reader.readLine());
            if (numb%2==0)
            {
                numbers.add(numb);
                //System.out.println(numb);
            }
        }
        reader.close();
        return numbers;
    }
    public static void sortArray(ArrayList<Integer> numbers)
    {
        Collections.sort(numbers);
        for (Integer i: numbers) {
            System.out.println(i);
        }
    }
}

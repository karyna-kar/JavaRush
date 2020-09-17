package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();

        for (int i=0; i<10; i++)
        {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        List <Integer> scors = new ArrayList<>();


        int count=1;
        for (int i=1; i<numbers.size(); i++) {
            if (i == numbers.size() - 1 && numbers.get(i).equals(numbers.get(i - 1))) {
                count++;
                scors.add(count);
            } else {
                if (numbers.get(i).equals(numbers.get(i - 1))) {
                    count++;
                }
                else {
                    if (count != 0) {
                        scors.add(count);
                        count = 1;
                    }
                }
            }
        }

        Collections.sort(scors);
        int result = scors.get(scors.size() - 1);

        System.out.println(result);

    }
    /*public static void counter (List list){
        int count=1;
        for (int i=1; i<list.size(); i++)
        {
            if (i==list.size()-1&&list.get(i)==list.get(i-1))
            {
                count++;
                scors.add(count);
            }
            else if (list.get(i)==list.get(i-1))
            {
                count++;
            }
            else
            {
                if (count!=0)
                {
                    scors.add(count);
                    count=1;
                }
            }
        }

    }*/
}
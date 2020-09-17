package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <Integer> mainArray = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<20; i++)
        {
            mainArray.add(Integer.parseInt(reader.readLine()));
        }


        ArrayList <Integer> firstArray = new ArrayList<Integer>();
        ArrayList <Integer> secondArray = new ArrayList<Integer>();
        ArrayList <Integer> otherArray = new ArrayList<Integer>();

        for (int i=0; i<mainArray.size();i++)
        {
            if (mainArray.get(i)%2==0 && mainArray.get(i)%3==0)
            {
                secondArray.add(mainArray.get(i));
                firstArray.add(mainArray.get(i));
            }
            else
            {
                if (mainArray.get(i)%2==0)
                {
                    secondArray.add(mainArray.get(i));
                }
                else
                {
                    if (mainArray.get(i)%3==0)
                    {
                        firstArray.add(mainArray.get(i));
                    }
                    else
                    {
                        otherArray.add(mainArray.get(i));
                    }
                }
            }
        }
        printList(firstArray);
        printList(secondArray);
        printList(otherArray);
    }

   /* public static ArrayList<Integer> initializeArrays() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer> rows = new ArrayList<Integer>();
        for (int i=0; i<20; i++)
        {
            rows.add(Integer.parseInt(reader.readLine()));
        }
        return  rows;
    }
*/
    public static void printList(ArrayList<Integer> list) {
        for (int i=0; i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}

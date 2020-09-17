package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> [] arrayOfStringList = new ArrayList[2];

        ArrayList<String> array1 = new ArrayList<>();
        for (int i=0; i<5; i++)
        {
            array1.add("Element"+i);
        }

        arrayOfStringList[0]=array1;

        ArrayList<String> array2 = new ArrayList<>();
        for (int i=0; i<5; i++)
        {
            array2.add("SecondElement"+i);
        }

        arrayOfStringList[1]=array2;
        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(createArray(5));
        list.add(createArray(2));
        list.add(createArray(4));
        list.add(createArray(7));
        list.add(createArray(0));
        return list;
    }
    public static int[] createArray(int size){
        int [] array = new int [size];
        for (int i=0; i<size; i++)
        {
            array[i]=1;
        }
    return array;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

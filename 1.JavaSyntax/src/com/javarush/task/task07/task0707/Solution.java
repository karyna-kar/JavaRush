package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> rows = new ArrayList();
        rows.add("Hello");
        rows.add(" ");
        rows.add("world");
        rows.add("!!!");
        rows.add("!!!");

        System.out.println(rows.size());
        for (int i=0; i<rows.size(); i++)
        {
            System.out.println(rows.get(i));
        }
    }
}

package com.javarush.task.task08.task0818;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map <String, Integer> employess = new HashMap <String, Integer>();
        employess.put("Работик1", 100);
        employess.put("Работик2", 200);
        employess.put("Работик3", 300);
        employess.put("Работик4", 400);
        employess.put("Работик5", 500);
        employess.put("Работик6", 600);
        employess.put("Работик7", 700);
        employess.put("Работик8", 800);
        employess.put("Работик9", 900);
        employess.put("Работик10", 1000);

        return employess;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            if (entry.getValue() < 500) {
                entryIterator.remove();
            }
        }
    }

    public static void main(String[] args)   {
       /* Map <String, Integer> employees = createMap();
        removeItemFromMap(employees);

        for (Map.Entry<String, Integer> k: employees.entrySet()) {
          System.out.println(k.getKey() +" -> "+ k.getValue());
        }*/
    }
}
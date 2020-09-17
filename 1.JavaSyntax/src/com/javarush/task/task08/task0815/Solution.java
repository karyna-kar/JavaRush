package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> people = new HashMap<>();
        people.put("Фамилия1","Имя1");
        people.put("Фамилия2","Имя1");
        people.put("Фамилия3","Имя2");
        people.put("Фамилия4","Имя2");
        people.put("Фамилия5","Имя3");
        people.put("Фамилия6","Имя3");
        people.put("Фамилия7","Имя7");
        people.put("Фамилия8","Имя8");
        people.put("Фамилия9","Имя9");
        people.put("Фамилия10","Имя10");

        return people;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        Iterator it1 = map.entrySet().iterator();
        int count=0;

        while (it1.hasNext())
        {
            Map.Entry pair = (Map.Entry) it1.next();
           if (pair.getValue().equals(name))
           {
               count++;
           }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count=0;
        for (Map.Entry<String, String> p: map.entrySet()) {
            if(p.getKey().equals(lastName))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
   /* Map<String, String> people = createMap();
    System.out.println("Совпадающие имена " + getCountTheSameFirstName(people, "Имя"));
    System.out.println("Совпадающие фамилии " + getCountTheSameLastName(people, "Фамилия1"));*/
    }
}

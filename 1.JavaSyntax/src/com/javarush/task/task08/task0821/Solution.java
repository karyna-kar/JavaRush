package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {

       Map<String, String> people = new HashMap<>();
        people.put("Фамилия1","Имя1");
        people.put("Фамилия2","Имя1");
        people.put("Фамилия3","Имя2");
        people.put("Фамилия4","Имя2");
        people.put("Фамилия5","Имя3");
        people.put("Фамилия6","Имя3");
        people.put("Фамилия6","Имя7");
        people.put("Фамилия8","Имя8");
        people.put("Фамилия9","Имя9");
        people.put("Фамилия9","Имя10");

        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

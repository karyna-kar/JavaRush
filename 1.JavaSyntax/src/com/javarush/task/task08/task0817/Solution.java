package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> names = new ArrayList<String>();
        for (Map.Entry<String, String> n : map.entrySet()) {
            names.add(n.getValue());
        }

        Collections.sort(names);

        for (int i = 0; i < names.size()-1; i++){
            if (names.get(i).equals(names.get(i + 1)) == true && map.containsValue(names.get(i))) {
                removeItemFromMapByValue(map, names.get(i));
             }
            }
        }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
      /*  Map<String, String> people = createMap();
        removeTheFirstNameDuplicates(people);

        for (Map.Entry<String, String> pair: people.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }*/



    }
}

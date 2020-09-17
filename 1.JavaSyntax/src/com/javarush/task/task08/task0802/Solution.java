package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map <String, String> fruits = new HashMap<String, String>();
        fruits.put("арбуз", "ягода");
        fruits.put("банан", "трава");
        fruits.put("вишня", "ягода");
        fruits.put("груша", "фрукт");
        fruits.put("дыня", "овощ");
        fruits.put("ежевика", "куст");
        fruits.put("жень-шень", "корень");
        fruits.put("земляника", "ягода");
        fruits.put("ирис", "цветок");
        fruits.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : fruits.entrySet()) {
            System.out.println(pair.getKey()+" - "+pair.getValue());
            
        }

    }
}

package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> inputs = new HashMap<String, Integer>();

        while (true){
            String id = reader.readLine();
            if (id.isEmpty())
            {
                break;
            }
            String name = reader.readLine();
            if (name.isEmpty())
            {
                inputs.put(name, Integer.parseInt(id));
                break;
            }

            inputs.put(name, Integer.parseInt(id));

        }

        for (Map.Entry<String, Integer> entry: inputs.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}

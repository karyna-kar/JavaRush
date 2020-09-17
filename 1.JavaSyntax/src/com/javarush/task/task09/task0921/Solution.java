package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
     public static void main(String[] args) {
           readData();
    }

    public static void readData(){
        List<Integer> inputs = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                Integer number = Integer.parseInt(reader.readLine());
                inputs.add(number);

            } catch (NumberFormatException | IOException e) {
                for (Integer n : inputs) {
                    System.out.println(n);
                }
                return;
            }
        }

    }
}

package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        System.out.println(name + " захватит мир через " + number + " лет. Му-ха-ха!");

    }
}

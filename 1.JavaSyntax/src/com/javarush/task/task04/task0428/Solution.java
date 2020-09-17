package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    
    static int count=0;
    
    public int  getPosNumb(int a)
    {
        if (a>0)
            count++;
        return count;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int count=0;

        if (a>0)
            count++;

        if (b>0)
            count++;

        if (c>0)
            count++;
        System.out.print(count);

       
        
        
        
                    
                    

    }
}

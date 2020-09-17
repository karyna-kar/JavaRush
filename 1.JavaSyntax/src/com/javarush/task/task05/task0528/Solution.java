package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("dd MM yyyy");
       Date today = new Date();
      System.out.print(df.format(today));
    }
}

package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 2 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        Calendar calendar = Calendar.getInstance();

        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Date current = dateFormat.parse(date);
        calendar.setTime(current);

        Date origin = dateFormat.parse("JANUARY 1 "+calendar.get(Calendar.YEAR));

        long msTimeDistance = current.getTime() - origin.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках
        int dayCount = (int) (msTimeDistance/msDay); //количество полных дней


        return dayCount%2==0;
    }
}

package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне1", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("JULY 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("MARCH 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("NOVEMBER 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("JANUARY 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("OCTOBER 1 2012"));

        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map){
        Calendar calendar = Calendar.getInstance();
        Iterator <Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry <String, Date> pair = it.next();
            calendar.setTime(pair.getValue());
            if (calendar.get(Calendar.MONTH)>=5 && calendar.get(Calendar.MONTH)<=7)
            {
                it.remove();
            }
        }


    }

    public static void main(String[] args) throws ParseException {
       /*Map<String, Date> map = createMap();
        removeAllSummerPeople(map);

        for (Map.Entry pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());

        }*/

    }
}

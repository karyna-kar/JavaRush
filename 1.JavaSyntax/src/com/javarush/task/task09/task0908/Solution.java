package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

import javafx.scene.chart.ScatterChart;

public class Solution {
    public static void main(String[] args) {
        try {

            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e)
        {
            System.out.print(e.toString());
        }

        //напишите тут ваш код
    }
}

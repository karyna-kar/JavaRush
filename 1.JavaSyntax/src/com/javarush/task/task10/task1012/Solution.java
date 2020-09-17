package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //Создание мапы
        HashMap<Character, Integer> counter = new HashMap<>();
        for (Character letter: alphabet) {
            counter.put(letter, 0);
        }

        for (String row: list) {
            char[] letters = row.toCharArray();
            for (char letter: letters) {
                if (alphabet.contains(letter))
                {
                  counter.put(letter, counter.get(letter)+1);
                }
            }
        }

        for (Character letter:alphabet) {
            System.out.println(letter+" "+counter.get(letter));
        }
        /*for (Map.Entry<Character, Integer> entry: counter.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/
    }


}

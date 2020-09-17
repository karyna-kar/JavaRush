package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isWhitespace;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputRow = reader.readLine();
        char[] letters = inputRow.toCharArray();
       // getVocal(letters);
        List<Character> vocal = getVocal(letters);
        printResult(vocal);

        List<Character> consonants = getConsonants(letters, vocal);
        System.out.println();
        printResult(consonants);
    }
    public static List<Character> getVocal(char[] letters)
    {
        List<Character> vocal = new ArrayList<>();
        for (Character l: letters) {
            for (Character v : vowels)
            {
             if (l.equals(v))
             {
                vocal.add(l);
             }
            }
        }
        return vocal;
    }
    public static List<Character> getConsonants(char[] letters, List<Character> vocal)
    {
        List<Character> consonants = new ArrayList<>();
        for (Character c: letters) {
            if(vocal.contains(c)==false){
                consonants.add(c);
            }
        }
        return consonants;
    }

    public static void printResult(List<Character> letters)
    {
        for (Character c: letters) {
            if(isWhitespace(c)==false)
            {
                System.out.print(c +" ");
            }
        }
    }
    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
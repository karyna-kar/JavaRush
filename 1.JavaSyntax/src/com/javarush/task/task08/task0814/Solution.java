package com.javarush.task.task08.task0814;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> numbers = new HashSet<>();
        /*int min = 0;
        int max = 30;
       for (int i=0; i<20; i++)
       {
           int random_int = (int)(Math.random() * (max - min + 1) + min);
           numbers.add(random_int);
       }*/
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);


        return numbers;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
       Iterator<Integer> iterator = set.iterator();
       while(iterator.hasNext())
       {
           if (iterator.next()>10)
           {
               iterator.remove();
           }
       }
        return set;

    }

    /*public static void print(Set<Integer> numbers){
        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }*/

    public static void main(String[] args) {

      /*  Set<Integer> numbers = createSet();

        print(numbers);
        removeAllNumbersGreaterThan10(numbers);
        System.out.println("------------------");
        print(numbers);*/



            
        }
    }


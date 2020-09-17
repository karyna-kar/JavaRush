package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        for (Cat cat : cats) {
            cats.remove(cat);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
       Set<Cat> cats = new HashSet<>();
       for (int i =1; i<4; i++)
       {
           cats.add(new Cat());
       }
       return cats;
    }

    public static void printCats(Set<Cat> cats) {
        Iterator it = cats.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        }


    public static class Cat{
     /*   public String name;
        public Cat(String name)
        {
            this.name = name;
        }*/
    }
}

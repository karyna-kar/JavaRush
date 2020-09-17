package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        System.out.println("----------");

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        for (int i=0; i<4; i++)
        {
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        for (int i=0; i<3; i++)
        {
            result.add(new Dog());
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> result = new HashSet<>();
        for (Cat c: cats) {
            result.add(c);
        }
        for (Dog d: dogs) {
            result.add(d);
        }
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator <Object>  it = pets.iterator();
        while (it.hasNext())
        {
            if (cats.contains(it.next()))
            {
               it.remove();
            }
        }

    }

    public static void printPets(Set<Object> pets) {
        for (Object o: pets)
        {
            System.out.println(o);
        }
    }

    public static class Cat{}
    public static class Dog{}

}

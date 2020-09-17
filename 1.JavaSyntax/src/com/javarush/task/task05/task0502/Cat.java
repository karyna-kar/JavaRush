package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int score1 = 0;
        int score2 = 0;

        if (this.age > anotherCat.age )
            score1++;
        else {if (this.age < anotherCat.age )
            score2++;}

        if (this.weight > anotherCat.weight )
            score1++;
        else {
            if (this.weight < anotherCat.weight )
                score2++;
        }

        if (this.strength > anotherCat.strength )
            score1++;
        else {
            if (this.strength < anotherCat.strength )
                score2++;
        }

        return  score1>score2;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat ();
        cat1.age = 1;
        cat1.weight = 2;
        cat1.strength = 6;

        Cat cat2 = new Cat ();
        cat2.age = 4;
        cat2.weight = 2;
        cat2.strength = 6;

        /*System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));*/


    }
}

package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }

    protected void finalize ()
    {
        System.out.print("A Cat was destroyed");
    }

}

class Dog {
    protected void finalize ()
    {
        System.out.print("A Dog was destroyed");
    }

    }

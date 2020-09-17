package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {

    String name, address, color;
    int age, weight;

   public Cat(String name)
   {
       this.name = name;
       this.address=null;
       this.color="blue";
       this.age=2;
       this.weight=3;
   }

    public Cat(String name, int weight, int age)
    {
        this.name = name;
        this.address=null;
        this.color="blue";
        this.age=age;
        this.weight=weight;
    }

    public Cat(String name, int age)
    {
        this.name = name;
        this.address=null;
        this.color="blue";
        this.age=age;
        this.weight=3;
    }

    public Cat(int weight, String color)
    {
        this.name = null;
        this.address=null;
        this.color=color;
        this.age=2;
        this.weight=weight;
    }

    public Cat(int weight, String color, String address)
    {
        this.name = null;
        this.address=address;
        this.color=color;
        this.age=2;
        this.weight=weight;
    }

    public static void main(String[] args) {

    }
}

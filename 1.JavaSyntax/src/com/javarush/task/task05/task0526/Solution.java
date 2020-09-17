package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Woman woman = new Woman("Karina", 23, "Рымдюны");
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        Woman woman2 = new Woman("Nastia", 25, "Grodno");
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

        Man man = new Man("Petia", 26, "Островец");
        System.out.println(man.name + " " + man.age + " " + man.address);
        Man man2 = new Man("Sasha", 23, "Minsk");
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
    }

    public static class Woman {
        String name, address;
        int age;

        public Woman() {
        }

        public Woman(String name) {
            this.name = name;
            this.address = null;
            this.age = 25;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.address = null;
            this.age = age;
        }

        public Woman(String name, String address) {
            this.name = name;
            this.address = address;
            this.age = 25;
        }

        public Woman(int age, String address) {
            this.name = "Kate";
            this.address = address;
            this.age = age;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }

    public static class Man {
        String name, address;
        int age;

        public Man() {
        }

        public Man(String name) {
            this.name = name;
            this.address = null;
            this.age = 25;
        }

        public Man(String name, int age) {
            this.name = name;
            this.address = null;
            this.age = age;
        }

        public Man(String name, String address) {
            this.name = name;
            this.address = address;
            this.age = 25;
        }

        public Man(int age, String address) {
            this.name = "Kate";
            this.address = address;
            this.age = age;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}

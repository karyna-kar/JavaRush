package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.SplittableRandom;

public class Solution {
    public static void main(String[] args) {
        Human grandfatherM = new Human("Дедушка мамы", true, 67);
        Human grandmotherM = new Human("Бабушка мамы", false, 65);
        Human grandfatherF = new Human("Дедушка папы", true, 66);
        Human grandmotherF = new Human("Бабушка папы", false, 64);
        Human mother = new Human("Мама", false, 42, grandmotherM, grandfatherM);
        Human father = new Human("Папа", true, 43, grandmotherF, grandfatherF);
        Human sun = new Human("Сын", true, 18, mother, father);
        Human doter = new Human("Дочка", false, 15, mother, father);
        Human lastdoter = new Human("Дочка младшая", false, 10, mother, father);

        System.out.println(grandfatherF.toString());
        System.out.println(grandmotherF.toString());
        System.out.println(grandfatherM.toString());
        System.out.println(grandmotherM.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(sun.toString());
        System.out.println(doter.toString());
        System.out.println(lastdoter.toString());

    }


    public static class Human {
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
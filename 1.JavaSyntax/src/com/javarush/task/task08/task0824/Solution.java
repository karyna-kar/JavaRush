package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("Дочка1", false, 10);
        System.out.println(child1.toString());
        Human child2 = new Human("Сын1", true, 5);
        System.out.println(child2.toString());
        Human child3 = new Human("Сын2", true, 7);
        System.out.println(child3.toString());

        ArrayList <Human> grandchildren = new ArrayList<>();
        grandchildren.add(child1);
        grandchildren.add(child2);
        grandchildren.add(child3);

        Human mother = new Human("Мама", false, 30, grandchildren);
        System.out.println(mother.toString());
        Human father = new Human("Папа", true, 35, grandchildren);
        System.out.println(father.toString());

        ArrayList <Human> childrensM = new ArrayList<>();
        childrensM.add(mother);

        ArrayList <Human> childrensF = new ArrayList<>();
        childrensF.add(father);

        Human grandmotherM = new Human("БабушкаМамы", false, 50, childrensM);
        System.out.println(grandmotherM.toString());
        Human grandfatherM = new Human("ДедушкаМамы", true, 55, childrensM);
        System.out.println(grandfatherM.toString());

        Human grandmotherF = new Human("БабушкаПапы", false, 60, childrensF);
        System.out.println(grandmotherF.toString());
        Human grandfatherF = new Human("ДедушкаПапы", true, 61, childrensF);
        System.out.println(grandfatherF.toString());

    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> childrens)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = childrens;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

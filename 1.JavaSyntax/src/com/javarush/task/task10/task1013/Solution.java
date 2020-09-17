package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String middleName;
        private String lastName;
        private Integer age;
        private Human[] kids;
        private String address;

        //1
        public Human()
        {}

        //2
        public Human(String firstName)
        {
            this.firstName=firstName;
        }

        //3
        public Human(String firstName, String middleName)
        {
            this.firstName=firstName;
            this.middleName = middleName;
        }

        //4
        public Human(String firstName, String middleName, String lastName)
        {
            this.firstName=firstName;
            this.middleName = middleName;
            this.lastName = lastName;
        }

        //5
        public Human(String firstName, String middleName, String lastName, Integer age)
        {
            this.firstName=firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.age = age;
        }

        //6
        public Human(String firstName, String middleName, String lastName, Integer age,  String address)
        {
            this.firstName=firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.age = age;
            this.address = address;
        }

        //7
        public Human(String firstName, String middleName, String lastName, Integer age,  Human[] kids, String address)
        {
            this.firstName=firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.age = age;
            this.kids = kids;
            this.address = address;
        }

        //8
        public Human(String firstName,  String lastName, Integer age,  Human[] kids, String address)
        {
            this.firstName=firstName;
            this.lastName = lastName;
            this.age = age;
            this.kids = kids;
            this.address = address;
        }

        //9
        public Human(String firstName,  String lastName, Integer age)
        {
            this.firstName=firstName;
            this.lastName = lastName;
            this.age = age;
        }

        //10
        public Human(String firstName,  String lastName, Integer age,  String address)
        {
            this.firstName=firstName;
            this.lastName = lastName;
            this.age = age;
            this.address = address;
        }
    }
}

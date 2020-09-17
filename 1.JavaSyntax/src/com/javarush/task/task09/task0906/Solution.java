package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement [] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement elements = stackTraceElements[2];
        System.out.print(elements.getClassName() + ": "+elements.getMethodName()+": " +s);

    }
}

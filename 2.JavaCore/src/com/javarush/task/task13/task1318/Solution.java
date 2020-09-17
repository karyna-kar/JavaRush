package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        InputStream inStream = new FileInputStream(file);
        while (inStream.available() > 0)
        {
            int data = inStream.read();
            System.out.print((char) data); //читаем один байт из потока для чтения
        }
        inStream.close(); //закрываем потоки
        reader.close();
    }
}
package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
      //  OutputStream outputStream = new FileOutputStream(file);
        while (true)
        {
            String data = reader.readLine();
            if (data.equals("exit"))
            {
                writer.write(data + "\r\n");
                break;
            }
            else {
                writer.write(data +  "\r\n");
                //outputStream.write((data + "\r\n").getBytes());
            }
        }
        writer.close();
        reader.close();
    }
}

package com.learning.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 12:52
 * @Description:com.learning.stream
 * @version: 1.0
 */
public class InputSteamDemo {
    public static void main(String[] args) {
        InputStream inputStream=null;
        try {
            inputStream = new FileInputStream("abc.txt");
            int read = inputStream.read();
            System.out.println((char)read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

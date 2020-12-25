package com.learning.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 11:21
 * @Description:com.learning.stream
 * @version: 1.0
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("aaa.txt");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(99);
            fileOutputStream.write("\r\nyinzhen\r\n".getBytes());
            fileOutputStream.write("abcdefghijklmn".getBytes(), 5, 5);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

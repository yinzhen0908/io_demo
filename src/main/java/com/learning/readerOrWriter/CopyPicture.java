package com.learning.readerOrWriter;

import java.io.*;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 15:05
 * @Description:com.learning.readerOrWriter
 * @version: 1.0
 */
public class CopyPicture {
    public static void main(String[] args) {
        /*FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("1.jpg");
            writer = new FileWriter("2.jpg");
            int length = 0;
            char[] chars = new char[1024];
            while ((length=reader.read(chars))!=-1){
                writer.write(chars);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("1.jpg");
            fileOutputStream = new FileOutputStream("3.jpg");
            int length = 0;
            byte[] buffer = new byte[1024];
            while ((length=fileInputStream.read(buffer))!=-1){
                fileOutputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

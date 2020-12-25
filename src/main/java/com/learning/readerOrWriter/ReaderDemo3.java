package com.learning.readerOrWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 12:43
 * @Description:com.learning.readerOrWriter
 * @version: 1.0
 */
public class ReaderDemo3 {
    public static void main(String[] args) {
        Reader reader=null;
        try {
            reader = new FileReader("abc.txt");
            int length = 0;
            char[] chars = new char[104];
            //添加缓冲区
            while ((length=reader.read(chars))!=-1){
                System.out.println(new String(chars,0,length));
            }
            /*int read = reader.read();
            System.out.println((char)read);*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}

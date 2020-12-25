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
public class ReaderDemo2 {
    public static void main(String[] args) {
        Reader reader=null;
        try {
            reader = new FileReader("abc.txt");
            int read = 0;
            while ((read=reader.read())!=-1){
                System.out.print((char)read);
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

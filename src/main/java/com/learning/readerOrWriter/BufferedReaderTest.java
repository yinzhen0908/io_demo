package com.learning.readerOrWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther:yinzhen
 * @Date:2020/12/15 17:25
 * @Description:com.learning.readerOrWriter
 * @version: 1.0
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("aaa.txt");
            bufferedReader = new BufferedReader(fileReader);
            String read = null;
            while ((read = bufferedReader.readLine())!=null){
                System.out.println(read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

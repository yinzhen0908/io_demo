package com.learning.handlerStream;

import java.io.*;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 18:05
 * @Description:com.learning.handlerStream
 * @version: 1.0
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        try {
             fileInputStream = new FileInputStream(file);
             inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
             //为什么没有使用循环的方式，因为数据比较少，无法占满1024个缓冲区，只需要读取一次即可
             char[] chars = new char[1024];
             int length = inputStreamReader.read(chars);
            System.out.println(new String(chars,0,length));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

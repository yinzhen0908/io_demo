package com.learning.streamtype;

import java.io.*;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 18:51
 * @Description:com.learning.stream
 * @version: 1.0
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(123);
            bufferedOutputStream.write("www.baidu.com".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}

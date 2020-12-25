package com.learning.readerOrWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 13:27
 * @Description:com.learning.readerOrWriter
 * @version: 1.0
 */
public class WriterDemo {
    public static void main(String[] args) {
        File file = new File("writer.txt");
        Writer writer=null;
        try {
            writer= new FileWriter(file);
            writer.write("abc");
            writer.write("我爱你中国");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

package com.learning.readerOrWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther:yinzhen
 * @Date:2020/12/15 17:41
 * @Description:com.learning.readerOrWriter
 * @version: 1.0
 */
public class BufferedWriterTest {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("abc.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("hello word");
            bufferedWriter.write(" here is nanjing");
            bufferedWriter.newLine();
            bufferedWriter.append("我爱你中国");
            bufferedWriter.newLine();
            bufferedWriter.append("我爱你南京");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

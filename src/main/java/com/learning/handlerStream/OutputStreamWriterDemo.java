package com.learning.handlerStream;

import java.io.*;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 15:30
 * @Description:com.learning.handlerStream
 * @version: 1.0
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        OutputStreamWriter outputStreamWriter=null;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            //按照需要存储的格式设置编码格式
            outputStreamWriter = new OutputStreamWriter(fileOutputStream,"utf-8");
            outputStreamWriter.write(99);
            outputStreamWriter.write("我爱你中国");
            outputStreamWriter.write("abcdefg",0,5);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流对象的时候，建议按照创建时的顺序的逆序进行关闭
            try {
                outputStreamWriter.close();
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

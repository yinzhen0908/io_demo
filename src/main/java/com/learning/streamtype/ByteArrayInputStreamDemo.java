package com.learning.streamtype;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 18:36
 * @Description:com.learning.stream
 * @version: 1.0
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        byte[] buffer = "yinzhen".getBytes();
        ByteArrayInputStream byteArrayInputStream = null;
        byteArrayInputStream = new ByteArrayInputStream(buffer);
        int read = 0;
        while ((read = byteArrayInputStream.read())!=-1){
            byteArrayInputStream.skip(5);//每次跳过5个字节
            System.out.println((char)read);
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

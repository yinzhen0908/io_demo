package com.learning.streamtype;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 18:51
 * @Description:com.learning.stream
 * @version: 1.0
 */
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(123);
        try {
            byteArrayOutputStream.write("yinzhen".getBytes());
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

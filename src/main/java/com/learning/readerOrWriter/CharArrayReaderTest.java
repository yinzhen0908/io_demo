package com.learning.readerOrWriter;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @Auther:yinzhen
 * @Date:2020/12/15 14:36
 * @Description:com.learning.readerOrWriter
 * @version: 1.0
 */
public class CharArrayReaderTest {
    public static void main(String[] args) {
        CharArrayReader charArrayReader = null;
        char[] buf = "我爱你中国".toCharArray();
        charArrayReader = new CharArrayReader(buf);
        int read = 0;
        try {
            while ((read = charArrayReader.read())!=-1) {
                System.out.print((char)read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            charArrayReader.close();
        }

    }
}

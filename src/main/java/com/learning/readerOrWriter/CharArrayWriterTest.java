package com.learning.readerOrWriter;

import java.io.CharArrayWriter;

/**
 * @Auther:yinzhen
 * @Date:2020/12/15 14:48
 * @Description:com.learning.readerOrWriter
 * @version: 1.0
 */
public class CharArrayWriterTest {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write(97);
        charArrayWriter.write(98);
        charArrayWriter.write(99);
        charArrayWriter.write(100);
        System.out.println(charArrayWriter);
        charArrayWriter.close();
    }
}

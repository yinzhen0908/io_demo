package com.learning.readerOrWriter;

import java.io.PrintStream;

/**
 * @Auther:yinzhen
 * @Date:2020/12/15 23:18
 * @Description:com.learning.readerOrWriter
 * @version: 1.0
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        //PrintStream printStream = null;
        /*try {
            printStream = new PrintStream(new FileOutputStream("abc.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        printStream.print("abc");
        printStream.println("我爱你中国");
        //格式化输出 %s 字符串 %d 整数 %f 浮点数
        //printStream.printf("%s---%d---%.2f", "我爱你中国",123,444.556);
        System.out.printf("%s---%d---%.2f", "我爱你中国",123,444.556);
        //如果是错误日志输出最好使用System.err.println
        System.err.println("这是红色的错误输出");
        printStream.close();
    }

}

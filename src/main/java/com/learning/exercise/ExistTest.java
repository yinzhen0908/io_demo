package com.learning.exercise;

import java.io.*;

/**
 * @Auther:yinzhen
 * @Date:2020/12/15 19:20
 * @Description:com.learning.exercise
 * @version: 1.0
 */
public class ExistTest {
    public static void main(String[] args) {
    //针对流关闭麻烦的问题，可以将创建的流对象写在try()中，节省了关闭流的操作
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);) {
            String read = "";
            while (!"exit".equals(read = bufferedReader.readLine())) {
                bufferedWriter.write(read);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

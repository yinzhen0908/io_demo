package com.learning.exercise;

import java.io.*;
import java.net.URL;

/**
 * @Auther:yinzhen
 * @Date:2020/12/15 20:08
 * @Description:com.learning.exercise
 * @version: 1.0
 */
public class BaiduTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            inputStream = new URL("https://www.baidu.com/").openStream();
            inputStreamReader = new InputStreamReader(inputStream);
            fileOutputStream = new FileOutputStream("baidu.html");
            outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            String read = "";
            while((read=bufferedReader.readLine())!=null){
                bufferedWriter.write(read);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            /*
                    InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null
             */
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}

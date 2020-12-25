package com.learning.streamtype;

import java.io.*;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 19:02
 * @Description:com.learning.streamtype
 * @version: 1.0
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] bytes = new byte[1024];
            int read1 = bufferedInputStream.read(bytes);
            System.out.println(new String(bytes,0,read1));
            /*int read = 0;
            while ((read = bufferedInputStream.read())!=-1){
                System.out.print((char)read);
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

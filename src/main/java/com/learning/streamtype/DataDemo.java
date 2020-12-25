package com.learning.streamtype;

import java.io.*;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 20:50
 * @Description:com.learning.streamtype
 * @version: 1.0
 */
public class DataDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        FileOutputStream fileOutputStream =null;
        DataOutputStream dataOutputStream = null;
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        try {
            //向文件中写入数据流
            fileOutputStream = new FileOutputStream(file);
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(123);
            dataOutputStream.writeShort(324);
            dataOutputStream.writeDouble(1.34);
            dataOutputStream.writeUTF("yinzhen殷真");

            //从文件中读取数据流
            fileInputStream = new FileInputStream(file);
            dataInputStream = new DataInputStream(fileInputStream);
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

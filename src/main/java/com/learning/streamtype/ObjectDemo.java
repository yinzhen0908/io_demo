package com.learning.streamtype;

import java.io.*;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 21:18
 * @Description:com.learning.streamtype
 * @version: 1.0
 */
public class ObjectDemo {
    public static void main(String[] args) {

        File file = new File("abc.txt");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(new Person(1, "张三","888888"));

            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Person person = (Person)objectInputStream.readObject();
            System.out.println(person.getId());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

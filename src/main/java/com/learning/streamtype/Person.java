package com.learning.streamtype;

import java.io.Serializable;

/**
 * @Auther:yinzhen
 * @Date:2020/12/14 21:18
 * @Description:com.learning.streamtype
 * @version: 1.0
 */
public class Person implements Serializable {

    private int id;
    private String name;
    private String pwd;

    public Person() {
    }

    public Person(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

package com.spring.pack07;

/**
 * Created by zhangjinye on 2017/3/17.
 */
public class SpringDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String string() {
        return name + ":----:" + age;
    }
}

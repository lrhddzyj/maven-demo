package com.hyxt.maven;

import java.io.Serializable;

/**
 * @author: lrh
 * @date: 2019-05-15 09:58
 * @Description:
 */
public class TestVo1 implements Serializable {

    private static final long serialVersionUID = 912336286718166879L;

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

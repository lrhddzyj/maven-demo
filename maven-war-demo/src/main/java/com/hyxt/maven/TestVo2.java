package com.hyxt.maven;

import java.io.Serializable;

/**
 * @author: lrh
 * @date: 2019-05-15 10:02
 * @Description:
 */
public class TestVo2 implements Serializable {

    private static final long serialVersionUID = 3088085948485656170L;

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

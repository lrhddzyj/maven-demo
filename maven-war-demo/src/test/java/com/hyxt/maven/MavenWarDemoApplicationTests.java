package com.hyxt.maven;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MavenWarDemoApplicationTests {



    @Test
    public void contextLoads() {
        TestVo1 testVo1 = new TestVo1();
        testVo1.setName("ag");
        testVo1.setAge("ttt");
        TestVo2 testVo2 = new TestVo2();

        BeanUtils.copyProperties(testVo1,testVo2);

        System.out.println(testVo2.getName());
        System.out.println(testVo2.getAge());
    }

}

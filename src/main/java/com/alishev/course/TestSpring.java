package com.alishev.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean testBean = ctx.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());

        ctx.close();
    }
}

package com.princekachu.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        var bean = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(bean.getBean("name"));
    }
}

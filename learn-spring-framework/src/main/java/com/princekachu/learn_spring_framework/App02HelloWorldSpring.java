package com.princekachu.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        var bean = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

//        System.out.println(bean.getBean("name"));
//        System.out.println(bean.getBean("age"));
//        System.out.println(bean.getBean("person"));
//        System.out.println(bean.getBean("person2MethodCall"));
//        System.out.println(bean.getBean("person3Parameters"));
//        System.out.println(bean.getBean("address"));
        System.out.println(bean.getBean(Address.class));

//        Arrays.stream(bean.getBeanDefinitionNames()).forEach(System.out::println);
    }
}

package com.princekachu.learn_spring_framework;

import com.princekachu.learn_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        context.getBean(GamingConsole.class).up();
    }
}

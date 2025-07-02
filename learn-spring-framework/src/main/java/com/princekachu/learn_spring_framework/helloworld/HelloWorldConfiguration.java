package com.princekachu.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {}
record Address(String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Pikachu";
    }

    @Bean
    public int age() {
        return 5;
    }

    @Bean
    @Primary
    public Address address1() {
        return new Address("Baker Street", "London");
    }

    @Bean(name = "overridePrimary")
    public Address address2() {
        return new Address("Main Street", "Utrecht");
    }

    @Bean
    public Person person(@Qualifier("overridePrimary") Address address) {
        return new Person(name(), age(), address);
    }
}

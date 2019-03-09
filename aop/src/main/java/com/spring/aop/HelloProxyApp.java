package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloProxyApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Hello hello = context.getBean(Hello.class);
        System.out.println(hello.getHello());
    }
}

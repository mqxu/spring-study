package com.spring.ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {
    public static void main(String[] args) {
        //1 读入配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
        //2 读取配置好的bean
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        //3 运行helloWorld的方法
        System.out.println(helloWorld.getHello());
    }
}

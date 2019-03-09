package com.spring.aop;

public class HelloImpl implements Hello {
    @Override
    public String getHello() {
        return "Hello, Spring AOP";
    }

    @Override
    public void insert() {
        System.out.println("开始进行插入操作");
    }
}

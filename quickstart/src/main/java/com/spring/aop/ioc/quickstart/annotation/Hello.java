package com.spring.aop.ioc.quickstart.annotation;

import org.springframework.stereotype.Component;

/**
 * 采用注解开发的bean
 */
@Component
public class Hello {
    public String getHello() {
        return "Hello World";
    }
}

package com.spring.ioc.annotation;

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

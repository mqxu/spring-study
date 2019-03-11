package com.spring.aspectj;

import org.aspectj.lang.annotation.*;

@Aspect
public class Fighter {
    @Pointcut("execution(* com.spring.aspectj.Tiger.walk())")
    public void foundTiger() {
    }

    @Before(value = "foundTiger()")
    public void foundBefore() {
        System.out.println("Fighter wait for tiger...");
    }

    @AfterReturning("foundTiger()")
    public void foundAfter() {
        System.out.println("Fighter fight with tiger...");
    }
}

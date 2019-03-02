package com.spring.ioc.annotation;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 采用注解和Lombok开发的Phone类
 */
@Component
@Data
public class Phone {
    @Value("iPhoneX")
    private String brand;

    @Value("6666.66")
    private double price;
}

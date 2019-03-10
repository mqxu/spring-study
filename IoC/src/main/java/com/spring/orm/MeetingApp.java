package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Meeting主程序
 *
 * @author 莫淇
 * 2019.3.4
 */
public class MeetingApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Meeting meeting = context.getBean(Meeting.class);
        System.out.println(meeting);
    }
}

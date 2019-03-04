package com.spring.quickstart;

public class MessageServiceImpl implements MessageService {
    private String username;
    private int age;

    public MessageServiceImpl() {
    }

    public MessageServiceImpl(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getMessage() {
        return "Hello World!" + "\nusername is " + username + ",age is " + age;
    }
}

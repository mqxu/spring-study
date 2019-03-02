package com.spring.mvc.controller;

import com.spring.mvc.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public List<User> getUser() {
        User user1 = new User("马云", 20);
        User user2 = new User("马化腾", 21);
        User user3 = new User("雷军", 22);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }
}

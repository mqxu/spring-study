package com.spring.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class UserLoginTest {
    @Autowired
    private User user;

    @Autowired
    private UserLogin userLogin;

    @Test
    public void userLogin() {
        assertEquals(true, userLogin.userLogin(user));
    }
}

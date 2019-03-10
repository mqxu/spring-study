package com.spring.orm;

public class UserLogin {
    private User user;

    public UserLogin() {
    }

    public UserLogin(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean userLogin(User user) {
        if ("admin".equals(user.getAccount()) && "123".equals(user.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}

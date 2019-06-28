package com.rk.mvvm.models;

/**
 * Created by user1 on 25/6/19.
 */

public class User {
    private String email;
    private String password;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getPassword() {
        return password;
    }
}

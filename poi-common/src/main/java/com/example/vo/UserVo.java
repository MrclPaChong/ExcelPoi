package com.example.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * User: lanxinghua
 * Date: 2018/10/3 19:54
 * Desc:
 */
@Data
public class UserVo implements Serializable {
    private String id;
    private String userName;
    private String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

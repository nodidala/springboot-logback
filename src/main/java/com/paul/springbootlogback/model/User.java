package com.paul.springbootlogback.model;

import java.io.Serializable;

/**
 * @author paul
 * @Description
 * @date 2019/8/1 17:07
 */
public class User implements Serializable {

    /** 自增主键  */
    private Integer id;

    /** 员工工号  */
    private String userId;

    /** 员工姓名 */
    private String userName;

    public User() {
    }

    public User(Integer id, String userId, String userName) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}

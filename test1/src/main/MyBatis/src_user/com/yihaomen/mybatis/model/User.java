package com.yihaomen.mybatis.model;

public class User {

    private int id;
    private String userName;
    private String userAge;
    private String userAddress;

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
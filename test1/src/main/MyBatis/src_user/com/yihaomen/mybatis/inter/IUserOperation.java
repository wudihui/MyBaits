package com.yihaomen.mybatis.inter;
import com.yihaomen.mybatis.model.User;

import java.util.List;

public interface IUserOperation {
    public User selectUserByID(int id);
    public List selectUsers(String userName);
    public void addUser(User user);

    public void deleteUser(int id);
}

package com.yihaomen.test;

import com.yihaomen.mybatis.model.User;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/23.
 */
public class TestTest {

    @org.junit.Test
    public void addUser() throws Exception {
        com.yihaomen.test.Test testUser=new com.yihaomen.test.Test();
        long a=System.currentTimeMillis();
        User user=new User();
        System.out.println();
        for (int i=0;i<10;i++) {
            testUser.addUser();
        }
        System.out.println("\r执行耗时 : "+(System.currentTimeMillis()-a)/1000f+" 秒 ");
    }

    @Test
    public void deleteUser() throws Exception {
    }

    @Test
    public void updateUser() throws Exception {
    }

    @Test
    public void getUserArticles() throws Exception {
    }

}
package com.yihaomen.test;

import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.yihaomen.mybatis.inter.IUserOperation;
import com.yihaomen.mybatis.model.Article;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yihaomen.mybatis.model.User;

public class Test {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

//  获取配置文件
    static{
        try{
            reader    = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//  接口sqlSessionFactory
    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }

//  获取
    public void getUserList(String userName) throws SQLException {

        SqlSession session = sqlSessionFactory.openSession();
        //sqlSessionFactory.openSession();
        try {
            IUserOperation userOperation=session.getMapper(IUserOperation.class);
            List<User> users = userOperation.selectUsers(userName);
            for(User user:users){
                System.out.println(user.toString());
            }

        } finally {
            session.close();
        }
    }
//   增加
    public void addUser(){
        User user=new User();
        user.setUserAddress("人民广场");
        user.setUserName("飞鸟");
        user.setUserAge(80);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            IUserOperation userOperation=session.getMapper(IUserOperation.class);
            userOperation.addUser(user);
            session.commit();
           // System.out.println("当前增加的用户 id为:"+user.getId());
        } finally {
            session.close();
        }
    }

//    删除
    public void deleteUser(int id){
        SqlSession session=sqlSessionFactory.openSession();
        try{
            IUserOperation userOperation=session.getMapper(IUserOperation.class);
            userOperation.deleteUser(id);
            session.commit();
            System.out.println("你删除了id为"+id+"的数据");
        }finally {
            session.close();
        }

    }
//    更新
public void updateUser(){
    //先得到用户,然后修改，提交。
    SqlSession session = sqlSessionFactory.openSession();
    try {
        IUserOperation userOperation=session.getMapper(IUserOperation.class);
        User user = userOperation.selectUserByID(4);//先用selectUserByID找到id为4的行
        user.setUserAddress("原来是魔都的浦东创新园区");//改变其UserAddress
        userOperation.updateUser(user);//然后重新把该行写入进去
        session.commit();   //提交

    } finally {
        session.close();
    }
}
// 关联数据一对多,多对一

    public void getUserArticles(int userid){
        SqlSession session = sqlSessionFactory.openSession();
        try {
            IUserOperation userOperation=session.getMapper(IUserOperation.class);
            List<Article> articles = userOperation.getUserArticles(userid);
            for(Article article:articles){
                System.out.println(article.getTitle()+":"+article.getContent()+
                        ":作者是:"+article.getUser().getUserName()+":地址:"+
                        article.getUser().getUserAddress());
            }
        } finally {
            session.close();
        }
    }

}
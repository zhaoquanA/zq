package com.bookstore;

import com.bookstore.beans.User;
import com.bookstore.dao.impl.UserDaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws Exception {
        // 准备数据库连接
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///bookstore", "root", "root");

        UserDaoImpl userDao = new UserDaoImpl();
        User zhangsan = new User("zhangsan", "123456", "110@jingcha.gov");
        userDao.saveUser(connection,zhangsan);


    }

}

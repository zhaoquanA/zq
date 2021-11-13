package com.bookstore.dao.impl;

import com.bookstore.beans.User;
import com.bookstore.dao.BaseDao;
import com.bookstore.dao.UserDao;

import java.sql.Connection;

public class UserDaoImpl extends BaseDao<UserDao> implements UserDao   {


    @Override
    public void saveUser(Connection conn, User user) {
        String sql = "insert into users(username,password,email) values(?,?,?)" ;
        update(conn,sql, user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public User getUser(Connection conn, User user) {
        return null;
    }

    @Override
    public boolean checkUsername(Connection conn, User user) {
        return false;
    }
}

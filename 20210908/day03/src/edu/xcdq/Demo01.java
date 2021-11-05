package edu.xcdq;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Demo01 {
    public static void main(String[] args)  {
        Connection connection = null ;
        Statement statement = null ;
        ResultSet resultSet = null ;
        try {
            // 1 注册驱动
            //DriverManager.registerDriver(new Driver());
            Class.forName("com.mysql.jdbc.Driver");
            // 2 获取连接
             connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test01", "root", "root");
            // 3 创建传输状态
             statement = connection.createStatement();
            // 4 准备sql语句并执行
             resultSet = statement.executeQuery("select * from book");
            // 5 得到结果，遍历结果
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) +" " + resultSet.getString(2)
                        + resultSet.getString(3) + " " + resultSet.getDouble(4)
                );
            }

        }catch ( Exception e ) {
            e.printStackTrace();
        }finally {
            System.out.println("无论如何都要执行");
            // 6 关闭资源
            if ( resultSet != null ) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    System.out.println("没有关闭成功哦，亲 ");
                    System.out.println("网络出问题了哦，宝 ");
                    e.printStackTrace();
                }
            }
            if (statement != null ) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if ( connection != null ) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }




    }
}

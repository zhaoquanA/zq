package edu.xcdq;

import java.sql.*;

public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2 获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test01?useUnicode=true&characterEncoding=UTF-8", "root", "root");
        // 3 创建状态   预编译  防止SQL注入，避免黑客攻击
        PreparedStatement preparedStatement = connection.prepareStatement("insert into book(`name`,author,prices) values (?,?,?)");
        // 4 执行查询
        preparedStatement.setString(1,"我的奋斗");
        preparedStatement.setString(2,"希特勒");
        preparedStatement.setDouble(3,9999);
        boolean result = false;
        result = preparedStatement.execute();
        // 5 获取结果并遍历
        /*if ( !result  ) {
            System.out.println("执行成功");
        }else {
            System.out.println("执行失败");
        }*/
        // 6 关闭资源
        preparedStatement.close();
        connection.close();





    }



}

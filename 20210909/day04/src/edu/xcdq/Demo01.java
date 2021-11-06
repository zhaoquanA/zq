package edu.xcdq;

import java.sql.*;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2 获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test01?useUnicode=true&characterEncoding=UTF-8", "root", "root");
        // 3 创建状态
        Statement statement = connection.createStatement();
        //PreparedStatement preparedStatement = connection.prepareStatement("insert into book(`name`,author,price) values (?,?,?)");
        // 4 执行查询
        String sql = " insert into book values (null ,'走向权力之路', '美玉学姐' , 999 ) ";
        String sql2 = " delete from book where author = '美玉学姐' ";
        String sql3 = " update book set name = '野史金瓶梅' where author = '凡凡' ";
        /*int reslut = 0 ;
        for (int i = 0; i < 100; i++) {
            reslut = statement.executeUpdate(sql);
        }*/
        int result = statement.executeUpdate(sql3);
        // 5 获取结果并遍历
        if ( result != -1 ) {
            System.out.println("执行成功");
        }else {
            System.out.println("执行失败");
        }
        // 6 关闭资源
        statement.close();
        connection.close();





    }



}

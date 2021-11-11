package edu.xcdq;

import sun.nio.cs.US_ASCII;

import javax.tools.Tool;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Tools.registerInfo();
        // 1 注册驱动
        Class.forName(Tools.getDriver());
        // 2 获取连接
        Connection connection = DriverManager.getConnection(Tools.getUrl(), Tools.getUser(), Tools.getPassword());
        // 3 准备传输对象
        Statement statement = connection.createStatement();
        // 4 执行查询
        ResultSet resultSet = statement.executeQuery("select * from book");
        // 5 遍历结果
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getInt(1) + resultSet.getString(2) +
                            resultSet.getString(3) + resultSet.getDouble(4)
            );
        }
        // 6 关闭资源
        Tools.closeAll(resultSet , statement , connection );


    }


}

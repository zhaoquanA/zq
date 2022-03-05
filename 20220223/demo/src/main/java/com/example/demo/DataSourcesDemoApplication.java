package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
@Slf4j
public class DataSourcesDemoApplication implements CommandLineRunner {

    // 引入数据源
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(DataSourcesDemoApplication.class, args);
    }

    // 显示数据源信息
    private void showConnection() throws SQLException {
        log.info("数据源基本信息" + dataSource.toString() ); //
        Connection connection = dataSource.getConnection();
        log.info("数据源链接信息" + connection.toString() );
        connection.close();
    }

    @Override
    public void run(String... args) throws Exception {
        showConnection();
        showData();
    }

    private void showData() {
        jdbcTemplate.queryForList("SELECT * FROM FOO")
                .forEach(row -> log.info(row.toString()));   // 方法().方法()  链式编程
        // row -> log.info(row.toString()) lambda 兰不哒表达式  本质：一个方法   since 1.8
    }

}

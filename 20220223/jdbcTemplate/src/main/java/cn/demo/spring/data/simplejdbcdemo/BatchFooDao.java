package cn.demo.spring.data.simplejdbcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


@Repository
public class BatchFooDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public void batchInsert() {
        /*jdbcTemplate.batchUpdate("insert into FOO (BAR) values (?)" ,
                new BatchPreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                        preparedStatement.setString(1  , "哈哈哈哈");
                    }

                    @Override
                    public int getBatchSize() {
                        return 20;
                    }
                }

                );*/

        ArrayList<Foo> list = new ArrayList<>();
        list.add(Foo.builder().id(10L).bar("哈哈哈哈哈").build());
        list.add(Foo.builder().id(20L).bar("呵呵呵呵呵").build());
        namedParameterJdbcTemplate.batchUpdate("INSERT INTO FOO (ID, BAR) VALUES (:id, :bar)",
                SqlParameterSourceUtils.createBatch(list)
                );




    }


}

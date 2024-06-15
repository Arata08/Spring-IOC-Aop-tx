package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    //声明一个 JdbcTemplate 对象作为成员变量来执行数据库操作。
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void updateNameById(String name, Integer id){
        String sql = "update students set name = ? where id = ? ;";
        int rows = jdbcTemplate.update(sql, name, id);
    }

    public void updateAgeById(Integer age,Integer id){
        String sql = "update students set age = ? where id = ? ;";
        jdbcTemplate.update(sql,age,id);
    }
}

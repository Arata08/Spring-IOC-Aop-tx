package com.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.example")
@PropertySource("classpath:jdbc.properties")
//@EnableAspectJAutoProxy //开启aspectj注解的支持
@EnableTransactionManagement //开启事务注解的支持
public class JavaConfig {
    /*从配置文件中读取数据库连接的相关信息。*/
    @Value("${cx.driver}")
    private String driver;
    @Value("${cx.url}")
    private String url;
    @Value("${cx.username}")
    private String username;
    @Value("${cx.password}")
    private String password;

    //druid连接池，使用 Druid 连接池来管理数据库连接。
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    //创建一个 JdbcTemplate bean，将上面创建的数据源对象注入其中，用于执行数据库查询和更新操作。
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    //创建一个用于管理事务的 TransactionManager bean，将数据源对象注入其中，以便在事务中控制数据库的操作。
    @Bean
    public TransactionManager transactionManager(DataSource dataSource){
        //内部要进行事务的操作，基于的连接池
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        //需要连接池对象
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}

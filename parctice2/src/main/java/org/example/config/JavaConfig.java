package org.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.print.attribute.standard.JobOriginatingUserName;
import javax.sql.DataSource;

/**
 * description: 配置类
 */
// 标识这是一个 Java 配置类
@Configuration
// 使用 ComponentScan 注解来扫描包 org.example
@ComponentScan(basePackages = "org.example")
// 使用 PropertySource 注解来加载 classpath:jdbc.properties 文件中的配置信息
@PropertySource("classpath:jdbc.properties")
public class JavaConfig {

    @Bean // 定义一个数据源 bean
    public DataSource dataSource( // 注入 driver、url、username、password 等配置信息
                                  @Value("${cx.driver}") String driver,
                                  @Value("${cx.url}") String url,
                                  @Value("${cx.username}") String username,
                                  @Value("${cx.password}") String password) {

        // 创建一个 DruidDataSource 对象
        DruidDataSource dataSource = new DruidDataSource();
        // 设置驱动类名
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        // 返回数据源 bean
        return dataSource;
    }

    @Bean // 定义一个 JdbcTemplate bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) { // 注入数据源 bean
        // 创建一个 JdbcTemplate 对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 设置数据源
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}



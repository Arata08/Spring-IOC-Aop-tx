package org.example.ioc_4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaBean {


    //直接赋值
    private  int age = 55;

    //注解
    @Value("海波东")
    private  String name;

    //${key:defaultValue} 没有key的时候defaultValue为默认值

    @Value("${jdbc.username:admin}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Override
    public String toString() {
        return "JavaBean{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

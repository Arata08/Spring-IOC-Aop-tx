package com.example.test;

import org.example.ioc1.XxxController;
import org.example.ioc1.XxxDao;
import org.example.ioc2.JavaBean;
import org.example.ioc3.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest  {
    @Test
    public void test1(){
        //创建ioc容器
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("annotation_01.xml");
        //获取组件
        XxxDao bean = applicationContext.getBean("xxxDao",XxxDao.class);
        System.out.println("bean = "+bean);
        Object xxxSevice = applicationContext.getBean("xxxService");
        System.out.println("xxxSevice = "+xxxSevice);

        //xxxController因为xml中排除了org.springframework.stereotype.Controller所以报错
        XxxController controller = applicationContext.getBean("xxxController",XxxController.class);
        System.out.println("controller = "+controller);
        //关闭容器
        applicationContext.close();
     }

     @Test
     public void test2(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("annotation_02.xml");
         JavaBean javaBean = applicationContext.getBean("javaBean",JavaBean.class);
         JavaBean javaBean1 = applicationContext.getBean("javaBean",JavaBean.class);
         System.out.println(javaBean == javaBean1);
         applicationContext.close();
     }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("annotation_03.xml");
        UserController userController = applicationContext.getBean(UserController.class);

        //场景一：ioc容器中有一个userService接口对应的实现类对象
        userController.show();

        //场景二：同一类型有多个对应的组件，Autowired也会报错
        //解决：1.成员属性名指定Autowired多个组件时，默认会根据成员属性名查找
        // 2.指定Autowired的组件名@Resource(name='newUserServiceImpl') = @Autowired + @Qualifier(value='newUserServiceImpl')

    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("annotation_04.xml");
        org.example.ioc_4.JavaBean user = applicationContext.getBean(org.example.ioc_4.JavaBean.class);
        System.out.println(user);
        applicationContext.close();
    }
}

package org.example.ioc3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Qualifier("newUserServiceImpl")//指定组件名称
    /*@Autowired自动装配注解（DI）：
    1.ioc容器中查找符合类型的组件对象
    2.将组件对象注入到当前对象中*/
    @Autowired
    private UserService userService;

    @Resource//指定组件名称,等同@Autowired + @Qualifier(value='newUserServiceImpl')
    private UserService userService1;
    
    //@Autowired
    //public UserController(UserService userService) {
    //    this.userService = userService;
    //}

    //@Autowired
    //public void setUserService(UserService userService) {
    //    this.userService = userService;
    //}

    public void show(){
        String show = userService.show();
        System.out.println("show: " + show);
    }
}

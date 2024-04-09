package example;

import org.example.config.JavaConfig;
import org.example.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIoCTest {
    @Test
    public void test(){
        //使用 AnnotationConfigApplicationContext 类初始化一个应用程序上下文对象，
        //同时指定了配置类 JavaConfig.class。
        //通过这个应用程序上下文对象直接获取 StudentController 类型的 bean 实例。
        //调用 controller 对象的 findAll() 方法，执行相应的操作
        StudentController controller = new AnnotationConfigApplicationContext(JavaConfig.class)
                .getBean(StudentController.class);
        controller.findAll();
    }
}
package springTest;

import org.example.config.JavaConfiguration;
import org.example.config.JavaConfigurationA;
import org.example.ioc_1.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {
    @Test
    public void test(){
        // AnnotationConfigApplicationContext-IOC容器对象
        AnnotationConfigApplicationContext iocContainerAnnotation =
                new AnnotationConfigApplicationContext();
        //外部设置配置类
        iocContainerAnnotation.register(JavaConfiguration.class);
        //刷新后方可生效！！
        iocContainerAnnotation.refresh();

        StudentController studentController = iocContainerAnnotation.getBean(StudentController.class);
        System.out.println("studentController = " + studentController);
    }
    @Test
    public void test1(){
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(JavaConfigurationA.class);
    }
}

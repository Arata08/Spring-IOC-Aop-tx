package ioc;

import org.example.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        StudentController bean = applicationContext.getBean(StudentController.class);
        bean.findAll();
    }
}

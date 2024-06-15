package org.example.ioc2;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)//单例，默认的
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)//多例
@Component  //bean  id=javabean class="JavaBean"
public class JavaBean {

    /*
    @PostConstruct修饰的方法会在服务器加载Servlet的时候运行，并且只会被服务器执行一次。
    @PreDestroy修饰的方法会在服务器销毁 Servlet的时候运行，并且只会被服务器执行一次。
    通常我们会是在Spring框架中使用到@PostConstruct注解 该注解的方法在整个Bean初始化中的执行顺序：
    Constructor(构造方法) -> @Autowired(依赖注入) -> @PostConstruct(注释的方法)
    */

    @PostConstruct
    public void init(){
        System.out.println("JavaBean init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("JavaBean destroy");
    }
}

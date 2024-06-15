package com.example.advice;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * description: 增强类的内部要存储增强代码
 *
 *   1. 定义方法存储增强代码
 *      具体定义几个方法,根据插入的位置决定!
 *   2. 使用注解配置 指定插入目标方法的位置
 *       前置   @Before
 *       后置   @AfterReturning
 *       异常   @AfterThrowing
 *       最后   @After
 *       环绕   @Around
 *
 *       try{
 *           前置
 *           目标方法执行
 *           后置
 *       }catch(){
 *           异常
 *       }finally{
 *           最后
 *       }
 *
 *   3. 配置切点表达式 [选中插入的方法   切点]
 *
 *   4.补全注解
 *      加入ioc容器 @Component
 *      配置切面  @Aspect  =  切点 + 增强
 *
 *   spring aop 重点是 配置
 *
 *   5.开启aspect注解的支持
 *
 *
 */
//@Component
//@Aspect
//@Order(20)
public class LogAdvice {

    @Before("com.example.pointcut.MyPointCut.pc()")
    public void start(){
        System.out.println("方法开始了");
    }

    @After("com.example.pointcut.MyPointCut.pc()")
    public void after(){
        System.out.println("方法结束了");
    }

    @AfterThrowing("com.example.pointcut.MyPointCut.pc()")
    public void error(){
        System.out.println("方法报错了");
    }
}

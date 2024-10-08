package com.example.service.impl;
import org.springframework.stereotype.Component;

/**
 * 实现计算接口,单纯添加 + - * / 实现! 掺杂其他功能!
 * <p>
 * aop - 只针对ioc容器的对象 - 创建代理对象 -> 代理对象存储到ioc容器
 *
 */
@Component
public class CalculatorPureImpl  {

    public int add(int i, int j) {
        return i + j;
    }
    

    public int sub(int i, int j) {
        return i - j;
    }
    

    public int mul(int i, int j) {
        return i * j;
    }
    

    public int div(int i, int j) {
        return i / j;
    }
}
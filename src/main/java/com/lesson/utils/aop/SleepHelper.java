package com.lesson.utils.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author dengxing
 * @Date 2019-04-26
 **/
public class SleepHelper implements MethodBeforeAdvice, AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("Sleep after");
    }

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Sleep before");
    }
}

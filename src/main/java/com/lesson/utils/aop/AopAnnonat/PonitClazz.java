package com.lesson.utils.aop.AopAnnonat;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author dengxing
 * @Date 2019-04-26
 **/
@Component
@Aspect
public class PonitClazz {
    @Pointcut("execution(* *.sleep(..))")
    public void sleep(){}


    @Before("sleep()")
    void sleepBefore(){
        System.out.println("Sleep before");
    }

    @After("sleep()")
    void sleepAfter(){
        System.out.println("Sleep after");
    }

}

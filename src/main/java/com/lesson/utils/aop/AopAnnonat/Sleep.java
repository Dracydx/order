package com.lesson.utils.aop.AopAnnonat;

import org.springframework.stereotype.Component;

/**
 * @Author dengxing
 * @Date 2019-04-26
 **/

@Component("Sleep")
public class Sleep {
    public void sleep(){
        System.out.println("Sleep");
    }
}

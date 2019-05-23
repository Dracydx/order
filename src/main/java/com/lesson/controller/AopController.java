package com.lesson.controller;

import com.lesson.utils.aop.AopAnnonat.PonitClazz;
import com.lesson.utils.aop.AopAnnonat.Sleep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Author dengxing
 * @Date 2019-04-26
 **/
@Controller
public class AopController {


    @Autowired
    private PonitClazz ponitClazz;
    @Autowired
    private Sleep sleep;

    @RequestMapping (value = "/aop",method = RequestMethod.GET)
    @ResponseBody
    public String aopTest(){
//
//        ApplicationContext applicationContext = new
//                ClassPathXmlApplicationContext("spring/applicationContext.xml");
//
//        Sleepable sleepable = (Sleepable) applicationContext.getBean("procxy");
//        sleepable.Sleep();

        sleep.sleep();
        return "success";
    }
}

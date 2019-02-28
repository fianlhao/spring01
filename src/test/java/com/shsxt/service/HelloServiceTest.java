package com.shsxt.service;

import com.shsxt.controller.HelloController;
import com.shsxt.dao.HelloDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;


/**
 * Created by Administrator on 2019/2/28.
 */
public class HelloServiceTest {
    @Test
    public void hello() throws Exception {
      /*  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.hello();*/
      //  FhApplicationContext context = new FhApplicationContext("spring.xml");
        /*HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.hello();*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        //userService.test();
        //System.out.println(userService.getList());
        //System.out.println(userService.getSet());
       /* HelloController helloController = (HelloController) context.getBean("hcontroller");
        helloController.test();*/
       //System.out.println(userService.getMap());
        System.out.println(userService.getProperties());
    }

}
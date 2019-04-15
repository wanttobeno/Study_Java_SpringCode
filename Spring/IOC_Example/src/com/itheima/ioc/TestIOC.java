package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
    private  static ApplicationContext applicationContext;
    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.say();
    }
}

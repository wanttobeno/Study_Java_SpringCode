package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static  void main(String[] args) {
//      // 使用这个API价值beans配置
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        // 获取bean中指定的对象
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        // 调用对方方法
        obj.getMessage();
    }
}

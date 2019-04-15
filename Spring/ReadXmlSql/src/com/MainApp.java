package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void Test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("./test/DBParaConstructor.xml");

        DBParaConstructor dbParaConstructor = (DBParaConstructor) context.getBean("DBParaConstructor");

        System.out.println(dbParaConstructor.sqlServerUserName);
        System.out.println(dbParaConstructor.sqlServerUrl);
    }

    public static void main(String[] args) {
        //如果xml文件在src下面的话，直接写文件名就行
        ApplicationContext context = new ClassPathXmlApplicationContext("DBParaProperty.xml");
        //根据bean节点的标识获取对象，id
        DBParaProperty dbParaProperty = (DBParaProperty) context.getBean("DBParaProperty");
        System.out.println(dbParaProperty.getSqlServerUserName());
        System.out.println(dbParaProperty.getSqlServerUrl());
        Test2();
    }
}

package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.Configuration;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        // Let us raise a start event.
        context.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        // Let us raise a stop event.
        context.stop();
    }
}

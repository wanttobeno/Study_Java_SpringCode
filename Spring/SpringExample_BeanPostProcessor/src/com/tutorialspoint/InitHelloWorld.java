package com.tutorialspoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {
    public  Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException {
        System.out.println("BeforInitialization : " + beanName);;
        return  bean;  // you can return any other object as weill
    }
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("AfterInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
}

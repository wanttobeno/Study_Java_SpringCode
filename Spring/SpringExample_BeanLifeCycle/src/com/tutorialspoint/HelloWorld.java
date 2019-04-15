package com.tutorialspoint;

public class HelloWorld {
    private String message;

    public String getMessage() {
        System.out.println("You Message ： "+ message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

// bean初始化回调
    public void init() {
        System.out.println("Bean is going through init.");
    }
// bean销毁回调
    public void destroy(){
        System.out.println("Bean will destory now.");
    }
}

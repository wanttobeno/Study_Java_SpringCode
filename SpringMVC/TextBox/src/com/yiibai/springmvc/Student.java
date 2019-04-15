package com.yiibai.springmvc;
// https://www.yiibai.com/spring_mvc/springmvc_textbox.html

public class Student {
    private  Integer age;
    private  String name;
    private  Integer id;

    public void setAge(Integer age) {
        this.age = age;
    }
    public  Integer getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public  void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}

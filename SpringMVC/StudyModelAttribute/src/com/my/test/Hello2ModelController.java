package com.my.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello2ModelController {

    @ModelAttribute(value = "myUser")
    public User populateModel() {
        User user = new User();
        user.setAccount("ray");
        return user;
    }
    @RequestMapping(value = "/helloWorld2")
    public String helloWorld(@ModelAttribute("myUser") User user) {
        user.setName("老王");
        return "helloWorld2";
    }
}

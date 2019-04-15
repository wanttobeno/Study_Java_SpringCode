package com.my.test;

// https://www.cnblogs.com/yg_zhang/p/4308271.html
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloModelController {

    @ModelAttribute
    public void populateModel(@RequestParam String abc, Model model) {
        model.addAttribute("attributeName",abc);
    }

    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "helloWorld";
    }
}

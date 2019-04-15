package com.yiibai.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String pringHello(ModelMap model) {
        model.addAttribute("myMessage","Hello, SPring MVC资源绑定视图解析器！");
        return "hello";
    }
}

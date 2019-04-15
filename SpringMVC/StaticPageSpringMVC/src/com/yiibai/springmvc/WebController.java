package com.yiibai.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class WebController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index() {
        return "/newIndex.jsp";
    }
    @RequestMapping(value = "/staticPage",method = RequestMethod.GET)
    public  String redirect() {
        return "redirect:/jsp/final.html";
    }
}

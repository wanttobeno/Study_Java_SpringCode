package com.yiibai.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;


@Controller
public class UserController {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public ModelAndView user() {
        User user = new User();
        user.setFavoriteFrameworks((new String[]{"Spring MVC", "Structs 2"}));
        user.setGender("M");
        ModelAndView model = new ModelAndView("user", "command", user);
        return model;
    }
    @RequestMapping(value = "/addUser",method=RequestMethod.POST)
    public  String addUser(@ModelAttribute("SpringWeb")User user,
                           ModelMap model) {
        model.addAttribute("username",user.getUsername());
        model.addAttribute("password",user.getPassword());
        model.addAttribute("address",user.getAddress());
        model.addAttribute("myfavoriteFrameworks",user.getFavoriteFrameworks());
        model.addAttribute("gender",user.getGender());
        return "userlist";
    }

    @ModelAttribute("webFrameworkList")
    public List<String> getWebFrameworkList()
    {
        List<String> webFrameworkList = new ArrayList<String>();
        webFrameworkList.add("Spring MVC");
        webFrameworkList.add("Spring Boot");
        webFrameworkList.add("Structs 2");
        webFrameworkList.add("Apache Hadoop");
        return  webFrameworkList;
    }
}

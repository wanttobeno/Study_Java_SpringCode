package com.my.test;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

   @RequestMapping(value = "/login",method= RequestMethod.GET)
    public ModelAndView login() {
        User user = new User();
       ModelAndView modelAndView = new ModelAndView("user","command", user);
        return modelAndView;
    }

    //@RequestMapping("/save")
    @RequestMapping(value = "/save",method=RequestMethod.POST)
    @ResponseBody
    public String save(@Valid User user, BindingResult result) {
        if(result.hasErrors()){
            List<ObjectError> ls=result.getAllErrors();
            for (int i = 0; i < ls.size(); i++) {
                System.out.println("error:"+ls.get(i));
            }
            return "error";
        }
        return "adduser";
    }



}

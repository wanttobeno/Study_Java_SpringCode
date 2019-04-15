package com.yiibai.springmvc;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends MultiActionController {

    public ModelAndView home(HttpServletRequest request,
                             HttpServletResponse response) throws  Exception {
        ModelAndView model = new ModelAndView("home");
        model.addObject("myMessage","Home");
        return model;
    }

    public ModelAndView add(HttpServletRequest request,HttpServletResponse response) throws Exception {
        ModelAndView model = new ModelAndView("user");
        model.addObject("myMessage","Add");
        return  model;
    }

    public  ModelAndView remove(HttpServletRequest request,HttpServletResponse response) throws Exception {
        ModelAndView model = new ModelAndView("user");
        model.addObject("myMessage","Remove");
        return model;
    }

}

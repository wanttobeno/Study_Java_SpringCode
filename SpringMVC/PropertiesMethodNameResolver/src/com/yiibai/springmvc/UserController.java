package com.yiibai.springmvc;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController extends MultiActionController{

    public ModelAndView home(HttpServletRequest request,
                             HttpServletResponse response) throws Exception {
        ModelAndView model = new ModelAndView("user");
        model.addObject("myMessage", "主页面(Home方法)");
        return model;
    }

    public ModelAndView add(HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        ModelAndView model = new ModelAndView("user");
        model.addObject("myMessage", "添加(Add方法)");
        return model;
    }

    public ModelAndView remove(HttpServletRequest request,
                               HttpServletResponse response) throws Exception {
        ModelAndView model = new ModelAndView("user");
        model.addObject("myMessage", "删除(Remove方法)");
        return model;
    }
}
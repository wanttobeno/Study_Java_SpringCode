package com.yiibai.springmvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends MultiActionController {

    public ModelAndView home(HttpServletRequest request,
                             HttpServletResponse response) throws Exception {
        ModelAndView model = new ModelAndView("user");
        model.addObject("myMessage","Home");
        return model;
    }

}

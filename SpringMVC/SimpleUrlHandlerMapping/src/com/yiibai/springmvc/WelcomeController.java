package com.yiibai.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class WelcomeController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) throws  Exception {
        ModelAndView model = new ModelAndView("welcome");
        String requestUri = request.getRequestURI();
        model.addObject("uri",requestUri);
        model.addObject("message","Welcome!");
        return model;
    }
}

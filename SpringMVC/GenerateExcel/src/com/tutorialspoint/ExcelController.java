package com.tutorialspoint;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class ExcelController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) throws Exception {
        //user data
        Map<String,String> userData = new HashMap<String,String>();
        userData.put("1","Mahesh");
        userData.put("2","Suresh");
        userData.put("3","Ramesh");
        userData.put("4","Naresh");
        userData.put("5","中文");
        return  new ModelAndView("UserSummary","userData",userData);
    }
}

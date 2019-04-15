package com.yiibai.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.portlet.ModelAndView;


import org.springframework.ui.ModelMap;



import java.io.File;
import java.io.IOException;


import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindingResult;


@Controller
public class FileUploadController {

    @Autowired
    //ServletContext context;
    HttpServletRequest context;

    @RequestMapping(value = "/fileUpload",method= RequestMethod.GET)
    public ModelAndView fileUploadPage() {
        FileModel file = new FileModel();
        ModelAndView modelAndView = new ModelAndView("fileUpload","command", file);
        return modelAndView;
    }

    @RequestMapping(value = "/fileUpload",method=RequestMethod.POST)
    public String fileUpload(@Validated FileModel file,
                             BindingResult result,ModelMap model) throws IOException {
        if (result.hasErrors()) {
            System.out.println("validation errors");
            return "fileUpload";
        } else {
            System.out.println("Fetching file");
            MultipartFile multipartFile = file.getFile();
            String uploadPath = context.getRealPath("") + File.separator + "temp" + File.separator;
            //Now do something with file...


            FileCopyUtils.copy(file.getFile().getBytes(),
                        new File(uploadPath+file.getFile().getOriginalFilename()));

            String fileName = multipartFile.getOriginalFilename();
            model.addAttribute("fileName",fileName);
            return "success";
        }
    }
}


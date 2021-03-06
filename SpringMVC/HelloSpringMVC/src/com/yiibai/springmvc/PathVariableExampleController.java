package com.yiibai.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


// 7.4- @PathVariable示例
// 处理URL的参数
@Controller
public class PathVariableExampleController {
    /**
     * @ PathVariable Example
     */
    @RequestMapping("/web/fe/{sitePrefix}/{language}/document/{id}/{naturalText}")
    public String documentView(Model model,
                               @PathVariable(value = "sitePrefix") String sitePrefix,
                               @PathVariable(value = "language") String language,
                               @PathVariable(value = "id") Long id,
                               @PathVariable(value = "naturalText") String naturalText) {
        model.addAttribute("sitePrefix",sitePrefix);
        model.addAttribute("language",language);
        model.addAttribute("id",id);
        model.addAttribute("naturalText",naturalText);

        String documentName = "Jave tutorial for Begainners";
        if (id == 8108) {
            documentName = "Spring MVC for Beginners";
        }
        model.addAttribute("documentName",documentName);
        return  "documentView";
    }
}

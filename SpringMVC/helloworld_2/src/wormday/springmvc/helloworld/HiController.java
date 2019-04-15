package wormday.springmvc.helloworld;
import org.springframework.stereotype.Controller;
// 这里导入一个Modlel类
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// URL路径前的一部分
@RequestMapping("/hi")
public class HiController {
    // URL路径前的一部分
    @RequestMapping("/say")
    public String say(Model model) {
        // 指定Model的值
        model.addAttribute("name","百度");
        model.addAttribute("url","http://www.baidu.com/");
        return "say";
    }
}
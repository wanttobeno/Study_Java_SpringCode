package wormday.springmvc.helloworld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// URL路径前的一部分
@RequestMapping("/hi")
public class HiController {
    // URL路径前的一部分
    @RequestMapping("/say")
    public String say() {
        // 指示view的位置（也就是jsp文件的位置）
        return "/WEB-INF/jsp/say.jsp";
    }
}
package sprint.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    /**
     *
     * welcome반환
     */
    @GetMapping("api/hello")
    @ResponseBody
    public String apiWelcome(){
        return "HelloWorld";
    }
}

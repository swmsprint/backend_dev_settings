package sprint.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sprint.test.domain.Info;
import sprint.test.domain.InfoForm;

@Controller
public class HelloController {
    /**
     *
     * welcome반환
     */
    @GetMapping("/http/get")
    @ResponseBody
    public String apiWelcome(){
        return "hello world!";

    }

}

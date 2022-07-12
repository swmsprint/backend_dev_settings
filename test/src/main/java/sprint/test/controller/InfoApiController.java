package sprint.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sprint.test.domain.Info;


@Slf4j
@RestController
public class InfoApiController {
    /**
     *
     * welcome반환
//     */
    @GetMapping("/http/get")
    @ResponseBody
    public String apiWelcome(){
        return "hello world!";

    }

}

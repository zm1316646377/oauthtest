package study.kathy.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kathy.zhang on 2019/8/21.
 */
//@Controller
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/getUser")
//    @ResponseBody
    public String getUser() {
        return "success";
    }
}

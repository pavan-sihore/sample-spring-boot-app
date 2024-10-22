package com.springboot.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class HelloController {
    
    @RequestMapping("/hello")
    public String index() {
        return "Hello DevOps Docker";
    }

}

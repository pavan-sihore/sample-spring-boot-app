package com.springboot.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
@ResponseBody 
public class DefaultController {
    
    @GetMapping
    public String home(){
        return "Welcome in Java Application with Docker!!";
    }

}

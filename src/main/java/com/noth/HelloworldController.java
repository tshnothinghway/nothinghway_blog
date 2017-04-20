package com.noth;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thway on 2017/4/20.
 */

@RestController
public class HelloworldController {

    @RequestMapping(value= "hello")
    public String hello(){
        return "hello";
    }
}

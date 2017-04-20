package com.noth.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by thway on 2017/4/20.
 */
@Controller
public class IndexController {

    @RequestMapping("/home")
    public String index(ModelMap map) {
        map.addAttribute("host", "hwww.nothinghway.com/blog");
        return "index";
    }

}

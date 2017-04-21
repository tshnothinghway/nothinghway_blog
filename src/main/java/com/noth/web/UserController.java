package com.noth.web;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by thway on 2017/4/20.
 */
@Controller
public class UserController {

    @ApiOperation(value = "获取用户列表",notes = "user_list")
    @ApiImplicitParam(name = "userId",value = "用户ID",required = true, dataType = "java.lang.Integer")
    @RequestMapping("/users")
    @ResponseBody
    public int users(int userId){
        return userId;
    }
}

package com.yonyou.trains.web;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.trains.service.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    IUserService userService;
    @RequestMapping("/")
    public String index(){
        return JSONObject.toJSONString(userService.getListUser());
//        return "index";
    }
}

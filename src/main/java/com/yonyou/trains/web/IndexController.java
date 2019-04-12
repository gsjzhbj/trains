package com.yonyou.trains.web;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.trains.service.api.IUserService;
import com.yonyou.trains.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
public class IndexController implements ResponseUtil {
    Logger logger= LoggerFactory.getLogger(ResponseUtil.MODULE_USER);
    @Autowired
    IUserService userService;

    /***
     * 用户数据查询
     * @return
     */
    @ResponseBody
    @RequestMapping("/")
    public JSONObject home(){
       return doSearch();
    }

    /***
     * 用户数据查询
     * @return
     */
    @ResponseBody
    @RequestMapping("/user")
    public JSONObject user(){
        return doSearch();
    }

    /***
     * 用户数据查询
     * @return
     */
    @ResponseBody
    @RequestMapping("/index")
    public JSONObject index(){
        return doSearch();
    }

    private JSONObject doSearch(){
        Date begin= Calendar.getInstance().getTime();
        logger.debug("接口开始响应,开始时间{}。", begin);
        JSONObject result=new JSONObject();
        result.put(RESPONSE_DATA,userService.getListUser());
        result.put(RESPONSE_STATUS,RESPONSE_STATUS_SUCCESS);

        logger.debug("接口成功响应，响应时间{}毫秒。",Calendar.getInstance().getTime().getTime()-begin.getTime());
        return result;
    }
}

package com.yonyou.trains;

import com.yonyou.trains.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class TrainsApplication {

    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger(ResponseUtil.PROJECT_NAME);
        Date begin=Calendar.getInstance().getTime();
        logger.debug("项目开始启动,开始时间{}。", begin);
        SpringApplication.run(TrainsApplication.class, args);
        logger.debug("项目成功启动，耗时{}毫秒。",Calendar.getInstance().getTime().getTime()-begin.getTime());
    }

}


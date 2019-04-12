package com.yonyou.trains;

import com.yonyou.trains.utils.ResponseUtil;
import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
@ServletComponentScan
public class TrainsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger(ResponseUtil.PROJECT_NAME);
        Date begin=Calendar.getInstance().getTime();
        logger.debug("项目开始启动,开始时间{}。", begin);
        SpringApplication.run(TrainsApplication.class, args);
        logger.debug("项目成功启动，耗时{}毫秒。",Calendar.getInstance().getTime().getTime()-begin.getTime());
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(TrainsApplication.class);
    }


}


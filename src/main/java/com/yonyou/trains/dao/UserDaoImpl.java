package com.yonyou.trains.dao;

import com.yonyou.trains.entity.UserEntity;
import com.yonyou.trains.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public class UserDaoImpl implements IUserDao{
    Logger logger= LoggerFactory.getLogger(ResponseUtil.MODULE_USER);
    @Override
    public List<UserEntity> getListUser() {
        logger.debug("执行{}.{}方法开始。",this.getClass().getSimpleName(),"getListUser");
        List<UserEntity> userEntities=new ArrayList<>();
        initUserTest(userEntities);
        logger.debug("执行{}.{}方法结束。",this.getClass().getSimpleName(),"getListUser");
        return userEntities;
    }
    private void initUserTest(List<UserEntity> userEntities){
        logger.debug("执行{}.{}方法开始。",this.getClass().getSimpleName(),"initUserTest");
        for(int i=0;i<2;i++){
            UserEntity user=new UserEntity();
            user.setCreateTime(new Date().toGMTString());
            user.setTrueName("高树江"+ UUID.randomUUID());
            user.setUserMail("gao123@yonyou.com");
            user.setUserPhone("18011008023");
            user.setUserName("gao123");
            user.setUserPwd("111111");
            userEntities.add(user);
        }
        logger.debug("执行{}.{}方法结束。",this.getClass().getSimpleName(),"initUserTest");
    }
}

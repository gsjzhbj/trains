package com.yonyou.trains.dao;

import com.yonyou.trains.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Repository
public class UserDaoImpl implements IUserDao{
    @Override
    public List<UserEntity> getListUser() {
        List<UserEntity> userEntities=new ArrayList<>();
        initUserTest(userEntities);
        return userEntities;
    }
    private void initUserTest(List<UserEntity> userEntities){
        for(int i=0;i<5;i++){
            UserEntity user=new UserEntity();
            user.setCreateTime(new Date().toGMTString());
            user.setTrueName("高树江");
            user.setUserMail("gao123@yonyou.com");
            user.setUserPhone("18011008023");
            user.setUserName("gao123");
            user.setUserPwd("111111");
            userEntities.add(user);
        }
    }
}

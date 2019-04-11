package com.yonyou.trains.service;

import com.yonyou.trains.dao.IUserDao;
import com.yonyou.trains.entity.UserEntity;
import com.yonyou.trains.service.api.IUserService;
import com.yonyou.trains.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    Logger logger= LoggerFactory.getLogger(ResponseUtil.MODULE_USER);

    @Autowired
    IUserDao userDao;
    @Override
    public List<UserEntity> getListUser() {
        logger.debug("执行{}.{}方法开始。",this.getClass().getSimpleName(),"getListUser");
        return userDao.getListUser();
    }
}

package com.yonyou.trains.service;

import com.yonyou.trains.dao.IUserDao;
import com.yonyou.trains.entity.UserEntity;
import com.yonyou.trains.service.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;
    @Override
    public List<UserEntity> getListUser() {
        return userDao.getListUser();
    }
}

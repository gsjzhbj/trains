package com.yonyou.trains.dao;

import com.yonyou.trains.entity.UserEntity;

import java.util.List;

public interface IUserDao {
    List<UserEntity> getListUser();
}

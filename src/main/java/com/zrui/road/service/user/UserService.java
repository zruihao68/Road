package com.zrui.road.service.user;

import com.zrui.road.entity.User;

/**
 * Created by zrui on 2016/7/1.
 */
public interface UserService {

    public User selectByKey(String id);

    public int iiiinsertUser(User user);
}

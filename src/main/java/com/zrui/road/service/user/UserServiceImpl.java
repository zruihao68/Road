package com.zrui.road.service.user;

import com.zrui.road.dao.user.UserMapper;
import com.zrui.road.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.UUID;

/**
 * Created by zrui on 2016/7/1.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    public User selectByKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional()
    public int iiiinsertUser(User user) throws RuntimeException {

        for (int i = 1; i<10;i++){
            user = new User();
            user.setId(UUID.randomUUID().toString().trim().replaceAll("-", ""));
            user.setUsername("AAA");
            if(i%2 == 0){
                user.setSex("o");
            }else{
                user.setSex("1");
            }
            user.setPassword("123456"+i);
            user.setPhone("13101008846"+i);
            user.setAddress("重庆开县");
            user.setBirthday("aaa");
            user.setEmail("384301135@qq.com");
            user.setPic("sss.png");
            user.setCreatetime(new Date());
            if(i%2 == 0){
                user.setStatus("o");
            }else{

                user.setStatus("1");
            }
            userMapper.insert(user);
        }
        return 1;
    }
}

package com.zrui.road.dao.user;


import java.util.List;
import com.zrui.road.entity.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    public List<User> queryAll();


}
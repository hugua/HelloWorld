package com.chen.service;

import com.chen.mapper.UserMapper;
import com.chen.pojo.User;
import com.chen.pojo.UserExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chen on 2017/5/22.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userManager;
    @Override
    public User getUserById(int id) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<User> userList = userManager.selectByExample(userExample);
        User user = null;
        if(userList != null && userList.size()>0){
            user = userList.get(0);
        }
        return user;
    }
}

package com.paul.springbootlogback.service.UserServiceImpl;

import com.paul.springbootlogback.mapper.UserMapper;
import com.paul.springbootlogback.model.User;
import com.paul.springbootlogback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author paul
 * @date 2019/8/1 17:14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUser(String userId) {
        return userMapper.selectUser(userId);
    }
}

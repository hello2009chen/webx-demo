package com.wellong.service.impl;

import com.wellong.dao.UserDao;
import com.wellong.model.User;
import com.wellong.service.intf.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wellong on 16/4/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public List<User> getUserById(Map<String, Object> map) {
        return userDao.getUserById(map);
    }
}

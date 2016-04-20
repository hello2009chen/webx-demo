package com.wellong.dao;

import com.wellong.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by wellong on 16/4/19.
 */
public interface UserDao {

   List<User> getUserById(Map<String, Object> map);

   int getMaxId(Map<String, Object> map);

}

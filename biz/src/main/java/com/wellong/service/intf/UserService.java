package com.wellong.service.intf;

import java.util.List;
import java.util.Map;
import com.wellong.model.User;
/**
 * Created by wellong on 16/4/19.
 */
public interface UserService {
    public List<User> getUserById(Map<String, Object> map);
}

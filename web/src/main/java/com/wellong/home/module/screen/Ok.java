package com.wellong.home.module.screen;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.wellong.home.module.BaseHandler;
import com.wellong.model.User;
import com.wellong.service.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wellong on 16/4/20.
 */
public class Ok extends BaseHandler {

    @Autowired
    UserService userService;

    public void execute(Context context, HttpServletRequest request) throws Exception {
        if (!super.isRequestForJSON()) {
            printSuccess("ok");
        } else {
            ajaxJson();
        }
    }

    public void ajaxJson() {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("name", "activity");
        paramMap.put("uuid", "8720a0c17554452e9b45864a28c8bc11");
        List<User> userList = userService.getUserById(paramMap);
        printSuccess(JSONObject.toJSONString(userList));
    }
}

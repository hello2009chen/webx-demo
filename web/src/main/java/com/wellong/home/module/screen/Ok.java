package com.wellong.home.module.screen;

import com.alibaba.citrus.turbine.Context;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wellong on 16/4/20.
 */
public class Ok {

    public void execute(Context context, HttpServletRequest request) throws Exception {
        String str = "Ok";
        context.put("result", str);
    }

}

package com.wellong.home.module.screen;

import com.alibaba.citrus.turbine.Context;
import com.wellong.home.module.BaseHandler;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by wellong on 16/4/20.
 */
public class Demo extends BaseHandler {

    @Autowired
    HttpServletResponse response;

    public void execute(Context context, HttpServletRequest request) throws Exception {
        printSuccess("ok");
    }

}

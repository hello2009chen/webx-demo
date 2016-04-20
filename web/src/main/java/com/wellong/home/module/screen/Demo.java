package com.wellong.home.module.screen;

import com.alibaba.citrus.turbine.Context;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by wellong on 16/4/20.
 */
public class Demo {

    @Autowired
    HttpServletResponse response;

    public void execute(Context context, HttpServletRequest request) throws Exception {
        PrintWriter out = null;
        try {
            response.setHeader("Content-Type","application/json");
            out = response.getWriter();
            out.print("ok");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            out.flush();
            out.close();
        }
        String str = "ok";
    }

}

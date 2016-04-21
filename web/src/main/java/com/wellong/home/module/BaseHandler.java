package com.wellong.home.module;

import com.alibaba.citrus.turbine.TurbineRunData;
import com.alibaba.citrus.turbine.util.TurbineUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by wellong on 16/4/20.
 */
public class BaseHandler {

    @Autowired
    HttpServletResponse response;

    @Autowired
    HttpServletRequest request;


    public void printSuccess(String str) {
        PrintWriter out = null;
        try {
            response.setHeader("Content-Type","application/json");
            out = response.getWriter();
            out.print(str);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            out.flush();
            out.close();
        }
    }


    public boolean isRequestForJSON() {
        TurbineRunData rundata = TurbineUtil.getTurbineRunData(request);
        return rundata.getTarget().toString().toLowerCase().contains(".json");
    }
}

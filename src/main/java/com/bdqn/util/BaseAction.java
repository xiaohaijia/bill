package com.bdqn.util;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class BaseAction {
     public static Map<String, Object> getRequest() {
	    return (Map) ActionContext.getContext().get("request");
     }
     public static Map<String, Object> getSession() {
	    return ActionContext.getContext().getSession();
     }
     public static Map<String, Object> getApplication() {
	    return (Map)ActionContext.getContext().getApplication();
     }
     public  static HttpServletResponse getResponse() {
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=gbk");
	    return response;
    }
}

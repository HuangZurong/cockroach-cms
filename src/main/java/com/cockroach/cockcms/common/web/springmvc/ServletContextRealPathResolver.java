package com.cockroach.cockcms.common.web.springmvc;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

@Component
public class ServletContextRealPathResolver implements RealPathResolver, ServletContextAware {

    public String get(String path) {
        String realPath = context.getRealPath(path);
        //tomcat8.0获取不到真实路径，通过/获取路径
        if (realPath == null) {
            realPath = context.getRealPath("/") + path;
        }
        return realPath;
    }

    public void setServletContext(ServletContext servletContext) {
        this.context = servletContext;
    }

    private ServletContext context;
}

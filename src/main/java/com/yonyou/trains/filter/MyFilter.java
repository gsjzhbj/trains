package com.yonyou.trains.filter;

import com.yonyou.trains.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


//@WebFilter(filterName = "myFilter", urlPatterns = "/*")
public class MyFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(ResponseUtil.PROJECT_NAME);
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.debug("init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();
        logger.debug("请求成功, 请求URI:{}" , requestURI);

        filterChain.doFilter(request, servletResponse);
    }

    @Override
    public void destroy() {
        logger.debug("destroy...");
    }
}


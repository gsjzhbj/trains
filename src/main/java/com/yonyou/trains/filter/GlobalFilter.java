package com.yonyou.trains.filter;

import com.yonyou.trains.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class GlobalFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(ResponseUtil.PROJECT_NAME);
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();
        logger.debug(requestURI);
        filterChain.doFilter(request, servletResponse);
    }

    @Override
    public void destroy() {

    }
}


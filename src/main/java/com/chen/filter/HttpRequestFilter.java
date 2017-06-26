package com.chen.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Http请求过滤器，用来记录用户的访问信息
 * Created by cvter on 2017/6/5.
 */
public class HttpRequestFilter extends OncePerRequestFilter{
    private  static Logger LOGGER = LoggerFactory.getLogger(HttpRequestFilter.class);
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String method = request.getMethod();
        String uri = request.getRequestURI();
        String host = request.getRemoteHost();
        String userAgent = request.getHeader("User-Agent");
        LOGGER.info(userAgent + ":" + host + ":" + method + ":" + uri );
//        System.out.println(userAgent + ":" + host + ":" + method + ":" + uri);
        filterChain.doFilter(request,response);
    }
}

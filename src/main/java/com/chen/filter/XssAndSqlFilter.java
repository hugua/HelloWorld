package com.chen.filter;

import com.chen.filter.handler.XssAndSqlRequestWarapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cvter on 2017/6/5.
 */
public class XssAndSqlFilter extends OncePerRequestFilter {
    private Logger LOGGER = LoggerFactory.getLogger(XssAndSqlRequestWarapper.class);
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        LOGGER.debug("xss filter working");
//        System.out.println("xss filter working");
        XssAndSqlRequestWarapper xssRequest = new XssAndSqlRequestWarapper(request);
        filterChain.doFilter(xssRequest,response);
    }
}

package com.sun.zq.filter;


import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@WebFilter(filterName = "myFilter", urlPatterns = "/")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("my filter init...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        log.info("doFilter 请求处理");

        //对request、response进行一些预处理

        // 比如设置请求编码

        // request.setCharacterEncoding("UTF-8");

        // response.setCharacterEncoding("UTF-8");

        //链路 直接传给下一个过滤器

        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("my filter 销毁");
    }
}

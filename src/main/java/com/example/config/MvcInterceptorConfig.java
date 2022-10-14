package com.example.config;

import com.example.controller.interceptor.ProjectInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.Resource;

@Configuration
public class MvcInterceptorConfig extends WebMvcConfigurationSupport {
    @Resource
    private ProjectInterceptor projectInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/**"); // 拦截所有
//              .addPathPatterns("/users", "/users/*");
    }
}

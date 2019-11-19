package com.example.demo2.LogInterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigurer implements WebMvcConfigurer {
    //拦截器
    public void addInterceptors(InterceptorRegistry registry){
    //增加一个拦截器
    registry.addInterceptor(new WebInterceptor()).addPathPatterns("/**");
    }

    }

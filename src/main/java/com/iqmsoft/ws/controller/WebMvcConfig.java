package com.iqmsoft.ws.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@SuppressWarnings("deprecation")
@Configuration
public class WebMvcConfig extends 
//WebMvcConfigurationSupport
WebMvcConfigurerAdapter 

{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("ws").setViewName("ws");
    }
}

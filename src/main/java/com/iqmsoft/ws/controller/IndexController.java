package com.iqmsoft.ws.controller;

//import com.agji.utils.CommonConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class IndexController {


    //read value from application.properties
    @Value("${hello:Hello}")
    private String hello;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("hello",hello);
        return "index";
    }

    @RequestMapping("/ws")
    public String ws(ModelMap model, HttpServletRequest req) {
        String serverName = "localhost:8080";
        model.put("serverName", serverName);
        return "ws";
    }
}

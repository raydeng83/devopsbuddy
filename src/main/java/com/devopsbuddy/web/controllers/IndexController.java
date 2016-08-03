package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lede on 8/3/16.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
}

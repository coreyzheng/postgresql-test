package com.corey.controller;

/**
 * Created by haibinzheng on 2018-03-13.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @RequestMapping("/")
    ModelAndView home(ModelAndView modelAndView) {

        modelAndView.setViewName("home");

        return modelAndView;
    }
}
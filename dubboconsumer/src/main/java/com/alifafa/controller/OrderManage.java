package com.alifafa.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping("/order")
public class OrderManage {

    @RequestMapping("/page")
    public ModelAndView orderListPage() {
        ModelAndView modelAndView = new ModelAndView("orderList");
        modelAndView.addObject("orderInfo","SO201806290001");
        return modelAndView;
    }
}

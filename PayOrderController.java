package com.test.web.home.controller;

@Controller
@RequestMapping("/trade")
public class PayOrderController {

    @RequestMapping("/payorder")
    public String payOrder(){
        return "trade/payorder.vm";
    }
}
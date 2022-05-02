package com.DoItNow.PersonalTaskManagementSoftware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PaypalController {

    @GetMapping("/payment2")
    public String paymentPage(){
        return "payment_page";
    }

}

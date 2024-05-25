package com.example.demo.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.Locale;

@Controller
public class BookController {
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String testController() {

        for (int i = 0;i < 10;i++){
            System.out.println(i);
        }
        return "default controller";
    }
    @GetMapping("/private")
    @ResponseBody
    public String privateController() {
        for (int i = 0;i < 10;i++){
            System.out.println(i);
        }
        return "private Controller";
    }

    @GetMapping("/public")
    @ResponseBody
    public String publicController() {
        for (int i = 0;i < 10;i++){
            System.out.println(i);
        }
        return "Public Controller";
    }

}

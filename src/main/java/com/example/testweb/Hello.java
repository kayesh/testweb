package com.example.testweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {

    @RequestMapping("/hello")
    public String helloPage(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name)
    {
        System.out.println("hello controller");
        return "test.html";
    }
}

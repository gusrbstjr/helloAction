package com.ohgiraffers.dockertest.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String defaultLocation() {
        return "main/main";

    }
}

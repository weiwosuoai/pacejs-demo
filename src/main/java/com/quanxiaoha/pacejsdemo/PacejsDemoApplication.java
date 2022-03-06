package com.quanxiaoha.pacejsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class PacejsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PacejsDemoApplication.class, args);
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}

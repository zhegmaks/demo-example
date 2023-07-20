package com.example.demoexample;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {
    @RequestMapping
    public String helloWorld() {
        return "Hello world !!!!";
    }

    @GetMapping("/index")
    public String index(@RequestParam("name") List<String> nameParam) {
        return nameParam.get(0);
    }

    @PreDestroy
    public void PreDestroy() {
        System.out.println("bye");
    }
}

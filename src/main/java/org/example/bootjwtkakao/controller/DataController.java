package org.example.bootjwtkakao.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
@CrossOrigin
public class DataController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

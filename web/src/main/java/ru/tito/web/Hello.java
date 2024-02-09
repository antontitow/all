package ru.tito.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "rest")
public class Hello {

    @GetMapping("/h")
    public String health() {
        return "work";
    }

    @PostMapping("/add")
    public String createProduct(@RequestParam String name) {
        return "work " + name;
    }
}

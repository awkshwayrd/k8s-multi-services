package com.poc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {
    @RequestMapping("/api/backend")
    public String getData() {
        return "backend";
    }
}

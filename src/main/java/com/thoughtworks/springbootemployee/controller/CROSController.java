package com.thoughtworks.springbootemployee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cros")
public class CROSController {
    @GetMapping
    public String crosRequest() {
        return "cros testing success";
    }
}

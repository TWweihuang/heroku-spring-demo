package com.thoughtworks.springbootemployee.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class DefaultController {
    @GetMapping
    public String defaultPage()
    {
        log.info("calling to DefaultController");
        return System.getProperty("spring.profiles.active");
    }
}

package com.thoughtworks.springbootemployee.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cors")
@Slf4j
public class CORSController {
    @GetMapping
    public String corsRequest()
    {
        log.info("calling to CORSController");
        return "cors testing success";
    }
}

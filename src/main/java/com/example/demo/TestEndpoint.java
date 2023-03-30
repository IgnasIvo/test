package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestEndpoint {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestEndpoint.class);


    @PostMapping("/log")
    public String logEverything(@RequestBody Map<Object, Object> values) {
        LOGGER.info("{}", values);
        return "ayy";
    }

}

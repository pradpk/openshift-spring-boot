package com.pradpk.awsspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/status")
    public String test() {
        return "Call is successful";
    }
}

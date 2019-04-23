package me.uc.cloud.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo")
    public String echo(@RequestParam(required = false, value = "msg") String msg) {
        return msg;
    }
}

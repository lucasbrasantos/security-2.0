package com.lucas.security_20.ping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

    @RequestMapping
    public String ping() {
        return "All good. You DO need to be authenticated to call this";
    }
}

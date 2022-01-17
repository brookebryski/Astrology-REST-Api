package com.example.AstrologyRESTApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AstrologyController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/astrology")
    public Astrology astrology(@RequestParam(value = "sign", defaultValue = "User") String sign) {
        return new Astrology(counter.incrementAndGet(), String.format(template, sign));
    }
}

// In Spring’s approach to building RESTful web services, HTTP requests are handled by a controller.
// This controller handles GET requests for /astrology by returning a new instance of the Astrology class.
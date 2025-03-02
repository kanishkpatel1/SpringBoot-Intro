package com.spring.uc1.helloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    // Create a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(HelloRestController.class);

    @GetMapping("/hello")
    public String hello() {
        // Logging at various levels
        logger.trace("Trace log: Entered hello() method");
        logger.debug("Debug log: Preparing hello message");
        logger.info("Info log: Sending hello message");
        logger.warn("Warn log: This is just a demonstration warning");
        logger.error("Error log: No error, just demonstration");

        return "Hello from BridgeLabz";
    }
}

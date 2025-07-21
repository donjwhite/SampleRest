package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRest {

    public static final Logger LOG = LoggerFactory.getLogger(SampleRest.class);

    @GetMapping(value = "/motd")
    public String getMessage() {
        LOG.info("Entering getMessage");
        return "Hello World I'm Back";
    }
}

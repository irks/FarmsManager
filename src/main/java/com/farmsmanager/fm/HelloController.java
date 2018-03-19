package com.farmsmanager.fm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/pozdro")
    public String index() {
        return "Hello World Koksy!";
    }

}

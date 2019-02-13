package dev.zetman99.springbootstudy.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    @GetMapping(path="/hello")
    public String hello() {
        return "HelloWorld.";
    }
}
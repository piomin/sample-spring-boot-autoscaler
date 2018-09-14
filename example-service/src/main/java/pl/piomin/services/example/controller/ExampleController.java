package pl.piomin.services.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @Value("${eureka.instance.instanceId}")
    private String instanceId;

    @GetMapping
    public String test() {
       return "I'm " + instanceId;
    }

}

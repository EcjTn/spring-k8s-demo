package com.ecjtaneo.kubernetesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @Value("${my-word}")
    private String myword;

    @GetMapping("/myword")
    public String hello() {
        return myword;
    }

    @GetMapping("/podname")
    public String whichPod() {
        return "Served by pod " + System.getenv("HOSTNAME");
    }

    // Pod should self-heal after crash
    @GetMapping("/trigger-crash")
    public String crashOnPurpose() {
        System.exit(1);
        return "this line is never reached";
    }

}

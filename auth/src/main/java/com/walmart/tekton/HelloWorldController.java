package com.walmart.tekton;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class HelloWorldController {


    @RequestMapping({ "/hello" })
    public String firstPage() {
        System.out.println("Hi...");

        return "Hello World";
    }


}

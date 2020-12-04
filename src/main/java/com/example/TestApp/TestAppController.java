package com.example.TestApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class TestAppController {

    @GetMapping ("/")
    public String helloWorld () {
        return "Hello world!";
    }
}
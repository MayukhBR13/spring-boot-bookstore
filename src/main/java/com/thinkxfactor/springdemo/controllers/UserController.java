package com.thinkxfactor.springdemo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    //private Map<String,Object> 
    private int count = 0;

    @GetMapping("/")
    public String error() {
        return "ERROR from User Controller";
    }

    @GetMapping("/counter")
    public String count() {
        count = count + 1;
        return "The counter value is : " + count;
    }

    @GetMapping("/abc")
    public String asd() {
        return "hi  ---------------------";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "This is a new server running!!";

    }

    @GetMapping("/hello2")
    public Map<String, String> sayHello2() {
        Map<String, String> respMap = new HashMap<>();
        respMap.put("name", "raj");
        respMap.put("age", "25");
        respMap.put("dept", "CSE");
        return respMap;

    }

    @GetMapping("/hio/{g}")
    public String hi(@PathVariable int g)
    {
        return "hi "+g;

    }



}

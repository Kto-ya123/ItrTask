package com.example.itrTask;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           Map<String,Object> model) {

        model.put("name", name);
        return "greeting";
    }
    @GetMapping()
    public String main(Map<String, Object> model){
        model.put("some", "Hello, go write code");
        return "main";
    }

}
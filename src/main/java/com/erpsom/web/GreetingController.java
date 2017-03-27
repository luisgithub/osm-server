package com.erpsom.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;



@RestController
public class GreetingController {



    @RequestMapping("/api/greeting/{name}")
    public Map<String, Object> greeting(@RequestParam(value="name", defaultValue="World") String name) {
        //return new Greeting(counter.incrementAndGet(), String.format(template, name));
    	Map<String,Object> model = new HashMap<String,Object>();
    	model.put("id", UUID.randomUUID().toString());
    	model.put("content", "Hello World "+name);
    	return model;
    }
}

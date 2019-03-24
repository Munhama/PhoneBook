package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/user")
    public String s(){
        DB db = new DB();
        return db.user();
    }
}

package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {

    @RequestMapping("/user")
    public ArrayList user(){
        DB db = new DB();
        return db.user();
    }

    @RequestMapping("/fiz")
    public ArrayList fiz(){
        DB db = new DB();
        return db.fiz();
    }

    @RequestMapping("/ur")
    public ArrayList ur(){
        DB db = new DB();
        return db.ur();
    }
}

package com.mehmetunluu.backend.controller;

/**
 * Created by Neval Bayram on 18.06.2016.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class BaseController {

    @RequestMapping("/munlu/healthcheck")
    public String healthCheck(){
        return  "I'm Ok!";
    }
}

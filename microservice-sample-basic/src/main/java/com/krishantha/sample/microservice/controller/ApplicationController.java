package com.krishantha.sample.microservice.controller;


import com.krishantha.sample.microservice.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {


    @RequestMapping("/app/helloworld")
    public Response getGreeting() {

        Response response = new Response();
        response.setCode("SAMPLE_CODE");
        response.setMessage("This is sample message");
        return response;

    }
}

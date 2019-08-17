package lk.codelabs.samples.microservicesamplebasic.controller;



import lk.codelabs.samples.microservicesamplebasic.model.Response;
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

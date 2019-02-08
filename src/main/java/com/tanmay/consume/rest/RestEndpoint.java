package com.tanmay.consume.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestEndpoint {

    @GetMapping(value = "/getValueFromAnotherRestEndpoint")
    public SampleReturnObject getValueFromAnotherRestEndpoint(){
        RestTemplate restTemplate = new RestTemplate ();
        SampleReturnObject sampleReturnObject = restTemplate.getForObject
                                ("http://localhost:8080/sendMessage", SampleReturnObject.class);

        return sampleReturnObject;
    }

    @GetMapping(value = "/sendMessage")
    public SampleReturnObject sendMessage(){
        SampleReturnObject sampleReturnObject = new SampleReturnObject();
        sampleReturnObject.setID(new Long ("1234567890"));
        sampleReturnObject.setMessage("Hello from another REST service");
        return sampleReturnObject;
    }
}

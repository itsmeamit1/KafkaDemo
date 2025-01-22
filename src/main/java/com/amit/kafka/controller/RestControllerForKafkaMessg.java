package com.amit.kafka.controller;

import com.amit.kafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafkaMessg {

    @Autowired
    Producer producer;

    @GetMapping("/producermesg")
    public void getMessgFromClient(@RequestParam("message") String message){
        producer.sendMegToTopic(message);


    }
}

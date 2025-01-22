package com.amit.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

        @KafkaListener( topics = "Amit_topic" , groupId = "Amit_groupId")
        public void listenToTopic(String recievedMessage){
            System.out.println("The received Messg is " + recievedMessage);

        }
}

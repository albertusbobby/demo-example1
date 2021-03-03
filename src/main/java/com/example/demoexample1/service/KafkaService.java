package com.example.demoexample1.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void kafkaProduceMessage(String message){
        kafkaTemplate.send("topic1", message);
    }

}

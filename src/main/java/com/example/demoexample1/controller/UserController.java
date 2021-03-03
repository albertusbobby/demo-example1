package com.example.demoexample1.controller;

import com.example.demoexample1.response.UserAppResponse;
import com.example.demoexample1.service.GetUserAppService;
import com.example.demoexample1.service.KafkaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private GetUserAppService getUserAppService;
    private KafkaService kafkaService;

    public UserController(GetUserAppService getUserAppService, KafkaService kafkaService) {
        this.getUserAppService = getUserAppService;
        this.kafkaService = kafkaService;
    }

    @GetMapping("/app/all/{id}")
    public UserAppResponse getAllUserApp(@PathVariable Long id){
        return getUserAppService.getUserApp(id);
    }

    @GetMapping("/kafka/{message}")
    public void kafka(@PathVariable String message){
        kafkaService.kafkaProduceMessage(message);
    }
}

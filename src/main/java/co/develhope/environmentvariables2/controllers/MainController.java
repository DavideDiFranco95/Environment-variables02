package co.develhope.environmentvariables2.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Value("${env.message}")
    public String welcomeMessage;

    @GetMapping("/message")
    public String getWelcomeMessageTest(){
        return welcomeMessage;
    }
}

package com.example.demo.controller;

import com.example.demo.model.MessageRequest;
import com.example.demo.model.MessageResponse;
import com.example.demo.service.ChatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public MessageResponse receiveMessage(@RequestBody MessageRequest request) {

        System.out.println("Incoming message: " + request.getMessage());

        String reply = chatService.getReply(request.getMessage());

        return new MessageResponse(reply);
    }
}

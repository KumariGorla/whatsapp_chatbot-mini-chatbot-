package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String message) {

        if (message == null) {
            return "I didn't understand";
        }

        message = message.toLowerCase();

        if (message.equals("hi")) {
            return "Hello";
        } 
        else if (message.equals("bye")) {
            return "Goodbye";
        } 
        else {
            return "Sorry, I don't understand";
        }
    }
}
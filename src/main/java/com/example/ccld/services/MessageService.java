package com.example.ccld.services;

public class MessageService {
    public String getMessage() {
        return "Hello from CCLD Library!";
    }

    public String getFormattedMessage(String name) {
        return String.format("Hello, %s! This message is from CCLD Library.", name);
    }
}

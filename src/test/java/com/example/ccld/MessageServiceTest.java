package com.example.ccld;

import com.example.ccld.services.MessageService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageServiceTest {
    private final MessageService messageService = new MessageService();

    @Test
    void getMessage(){
        assertEquals("Hello from CCLD Library!", messageService.getMessage());
    }

    @Test
    void getFormatedMessage() {
        assertEquals("Hello, Test! This message is from CCLD Library.",
                messageService.getFormattedMessage("Test"));
    }
}
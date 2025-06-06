package com.example.ccld;

import com.example.ccld.services.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CcldLibraryConfig {
    @Bean
    public MessageService messageService() {
        return new MessageService();
    }
}
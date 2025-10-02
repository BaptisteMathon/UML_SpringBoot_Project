package com.nextu.fileshare.config;

import com.nextu.fileshare.utils.EmailSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
    @Bean
    public EmailSender GetEmailSender() {
        return new EmailSender();
    }
}

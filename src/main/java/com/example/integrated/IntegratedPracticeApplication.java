package com.example.integrated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class IntegratedPracticeApplication {
    public static void main(String[] args) {
        SpringApplication.run(IntegratedPracticeApplication.class, args);
    }
}

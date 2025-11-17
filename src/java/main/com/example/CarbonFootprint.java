package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarbonFootprintCalculator implements CommandLineRunner {

    @Value("${app.title}")
    private String appTitle;

    @Value("${app.version}")
    private String appVersion;

    public static void main(String[] args) {
        SpringApplication.run(CarbonFootprintCalculator.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application Title: " + appTitle);
        System.out.println("Application Version: " + appVersion);
    }
}
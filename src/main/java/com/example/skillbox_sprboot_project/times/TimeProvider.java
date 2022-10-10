package com.example.skillbox_sprboot_project.times;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class TimeProvider implements CommandLineRunner {

    private final TimeServiceInterface timeService;
    private final TimeProviderProperties timeProviderProperties;

    @Value("${spring.application.name}")
    private String appName;

    @Value("${custom.welcomeMessage}")
    private String welcomeMessage;

    @Autowired
    public TimeProvider(TimeServiceInterface timeService, TimeProviderProperties timeProviderProperties) {
        this.timeService = timeService;
        this.timeProviderProperties = timeProviderProperties;
    }

    @Override
    public void run(String... args) {
        Logger.getLogger(this.getClass().getSimpleName()).info("running: " + appName + " with profile " + timeProviderProperties.getProfile());
        Logger.getLogger(this.getClass().getSimpleName()).info(welcomeMessage);
        Logger.getLogger(this.getClass().getSimpleName()).info(timeProviderProperties.getDescription());
        this.timeService.printCurrentTime();
    }
}

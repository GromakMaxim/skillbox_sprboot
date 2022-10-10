package com.example.skillbox_sprboot_project.times;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@ConditionalOnProperty(value = "spring.profiles.active", havingValue = "dev")
public class DevTimeService implements TimeServiceInterface {
    @Override
    public void printCurrentTime() {
        Logger.getLogger(this.getClass().getSimpleName()).info("UNDER CONSTRUCTION");
    }
}

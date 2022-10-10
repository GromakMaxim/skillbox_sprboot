package com.example.skillbox_sprboot_project.times;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

@Service
public class TimeService {

    private final TimeProviderProperties timeProviderProperties;

    @Autowired
    public TimeService(TimeProviderProperties timeProviderProperties) {
        this.timeProviderProperties = timeProviderProperties;
    }

    public void printCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat(timeProviderProperties.getFormat());
        Logger.getLogger(this.getClass().getName()).info("current time is: " + sdf.format(new Date()));
    }
}

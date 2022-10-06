package com.example.skillbox_sprboot_project.times;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

@Service
public class TimeService {

    public void printCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        Logger.getLogger(this.getClass().getName()).info("current time is: " + sdf.format(new Date()));
    }
}

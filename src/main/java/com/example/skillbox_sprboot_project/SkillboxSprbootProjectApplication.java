package com.example.skillbox_sprboot_project;

import com.example.skillbox_sprboot_project.times.TimeProviderProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:custom.properties")
@EnableConfigurationProperties(TimeProviderProperties.class)
public class SkillboxSprbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillboxSprbootProjectApplication.class, args);
	}

}

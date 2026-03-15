package com.omnipotent.task_tracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

//@ConfigurationPropertiesScan automatically scans for: @ConfigurationProperties

@SpringBootApplication
@ConfigurationPropertiesScan
public class TaskTrackingApplication {

	public TaskTrackingApplication() {
		// Prevent instantiation
	}

	public static void main(final String[] args) {
		SpringApplication.run(TaskTrackingApplication.class, args);
	}
}
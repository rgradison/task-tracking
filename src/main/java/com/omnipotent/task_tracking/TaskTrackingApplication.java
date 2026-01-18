/**
 * Application entry point for the Task Tracking service.
 */
package com.omnipotent.task_tracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public final class TaskTrackingApplication {

	private TaskTrackingApplication() {
		// Prevent instantiation
	}

	public static void main(final String[] args) {
		SpringApplication.run(TaskTrackingApplication.class, args);
	}
}
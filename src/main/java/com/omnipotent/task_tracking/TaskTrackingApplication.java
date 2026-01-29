package com.omnipotent.task_tracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Task Tracking application.
 *
 * <p>This class bootstraps the Spring Boot application and
 * prevents instantiation as a utility class.</p>
 */
@SpringBootApplication
public final class TaskTrackingApplication {

	/**
	 * Private constructor to prevent instantiation.
	 */
	private TaskTrackingApplication() {
		// Prevent instantiation
	}

	/**
	 * Main method that starts the Spring Boot application.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(final String[] args) {
		SpringApplication.run(TaskTrackingApplication.class, args);
	}

}
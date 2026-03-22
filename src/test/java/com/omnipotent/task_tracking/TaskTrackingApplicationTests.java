package com.omnipotent.task_tracking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class TaskTrackingApplicationTests {

	// Starts the full Spring context
	// Verifies that your application boots without errors
	// Helps JaCoCo count startup coverage
	// Helps SonarCloud detect that you have tests
	// Helps JaCoCo generate coverage
	// Ensures your CI pipeline doesn’t fail

	@Test
	void contextLoads() {
	}

}

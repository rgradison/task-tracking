package com.omnipotent.task_tracking.domain.model;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;

public class TaskTest {
    @Test
    void shouldCreateTask() {
        UserId userId = new UserId("user-123"); // Your UserId class
       Task task = new Task(
                "Study",
                "Some description",
                LocalDate.of(2026, 2, 20),
                new UserId("user-123"),
                Instant.now()
       );

       /* assertEquals("Study", task.getTitle());
        assertEquals("Study", task.getTitle());
        assertEquals(TaskStatus.NEW, task.getStatus());
        assertEquals(userId, task.getAssignedUserId());
        assertNotNull(task.getCreatedDate());*/

    }
}
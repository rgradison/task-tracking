package com.omnipotent.task_tracking.domain.model;

import com.omnipotent.task_tracking.domain.task.model.Task;
import com.omnipotent.task_tracking.domain.task.model.UserId;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class TaskTest {
    @Test
    void shouldCreateTask() {
        UserId userId = new UserId("user-123"); // Your UserId class
        Task task = Task.create(
                "School Work",
                "Some description",
                LocalDate.of(2026, 2, 20),
                userId
       );

        /* assertEquals("Study", task.getTitle());
        assertEquals("Study", task.getTitle());
        assertEquals(TaskStatus.NEW, task.getStatus());
        assertEquals(userId, task.getAssignedUserId());
        assertNotNull(task.getCreatedDate());*/

        /*TaskId id,
        String title,
        String description,
        TaskStatus status,
        LocalDate dueDate,
        Instant createdDate,
        UserId assignedUserId*/

    }
}
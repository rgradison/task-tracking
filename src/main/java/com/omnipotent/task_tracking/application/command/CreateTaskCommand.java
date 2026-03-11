package com.omnipotent.task_tracking.application.command; // Use case layer = application layer

import java.time.LocalDate;

public record CreateTaskCommand(
        String title,
        String description,
        LocalDate dueDate,
        Long assignedUserId
) {}
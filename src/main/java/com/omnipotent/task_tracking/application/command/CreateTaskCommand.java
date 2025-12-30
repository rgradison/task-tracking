package com.omnipotent.task_tracking.application.command;

import java.time.LocalDate;

public record CreateTaskCommand(
        String title,
        String description,
        LocalDate dueDate,
        Long assignedUserId
) {}
package com.omnipotent.task_tracking.domain.task.model;

import java.time.Instant;
import java.time.LocalDate;

public class Task {

    private final TaskId id;
    private String title;
    private String description;
    private TaskStatus status;
    private LocalDate dueDate;
    private final Instant createdDate;
    private UserId assignedUserId;

    private Task(TaskId id,
                 String title,
                 String description,
                 TaskStatus status,
                 LocalDate dueDate,
                 Instant createdDate,
                 UserId assignedUserId) {

        validate(title, description);

        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
        this.createdDate = createdDate;
        this.assignedUserId = assignedUserId;
    }

    public static Task create(String title,
                              String description,
                              LocalDate dueDate,
                              UserId assignedUserId) {

        return new Task(
                TaskId.generate(),
                title,
                description,
                TaskStatus.PENDING,
                dueDate,
                Instant.now(),
                assignedUserId
        );
    }

    public static Task restore(
            TaskId id,
            String title,
            String description,
            TaskStatus status,
            LocalDate dueDate,
            Instant createdDate,
            UserId assignedUserId
    ) {
        return new Task(id, title, description, status, dueDate, createdDate, assignedUserId);
    }

    private static void validate(String title, String description) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
    }

    public void updateDetails(String title, String description) {
        validate(title, description);
        this.title = title;
        this.description = description;
    }

    public void markCompleted() {
        if (this.status == TaskStatus.COMPLETED) {
            throw new IllegalStateException("Task already completed");
        }
        if (this.status == TaskStatus.OVERDUE) {
            throw new IllegalStateException("Cannot complete an overdue task");
        }
        this.status = TaskStatus.COMPLETED;
    }

    public void markOverdue() {
        if (this.status == TaskStatus.COMPLETED) return;
        if (dueDate != null && dueDate.isBefore(LocalDate.now())) {
            this.status = TaskStatus.OVERDUE;
        }
    }

    public void assignUser(UserId userId) {
        this.assignedUserId = userId;
    }

    public TaskId getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public TaskStatus getStatus() { return status; }
    public LocalDate getDueDate() { return dueDate; }
    public Instant getCreatedDate() { return createdDate; }
    public UserId getAssignedUserId() { return assignedUserId; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return id.equals(task.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
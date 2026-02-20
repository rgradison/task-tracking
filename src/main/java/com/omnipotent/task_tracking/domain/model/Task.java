package com.omnipotent.task_tracking.domain.model;

import java.time.Instant;
import java.time.LocalDate;

public class Task {

    private TaskId id;
    private String title;
    private String description;
    private TaskStatus status;
    private LocalDate dueDate;
    private UserId assignedUserId;
    private Instant createdDate;

    Task(String title,
         String description,
         LocalDate dueDate,
         UserId assignedUserId,
         Instant createdDate) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }

        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.assignedUserId = assignedUserId;
        this.status = TaskStatus.NEW;
        this.createdDate = createdDate;
    }

    /*public static Task create(String title, String description, LocalDate dueDate , UserId assignedUserId){
        Task task = new Task("Study");
        task.title = title;
        task.description = description;
        task.dueDate = dueDate;
        task.assignedUserId = assignedUserId;
        task.status = TaskStatus.NEW;
        task.createdDate = Instant.now();
        return task;
    }*/

    public TaskId getId() {
        return id;
    }
    public void setId(TaskId id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public TaskStatus getStatus() {
        return status;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public UserId getAssignedUserId() {
        return assignedUserId;
    }
    public Instant getCreatedDate() {
        return createdDate;
    }

}
package com.omnipotent.task_tracking.domain.task.model;

import java.util.Objects;
import java.util.UUID;

public class TaskId {

    private final UUID value;

    private TaskId(UUID value) {
        this.value = value;
    }

    public static TaskId of(UUID value) {
        return new TaskId(value);
    }

    public static TaskId generate() {
        return new TaskId(UUID.randomUUID());
    }

    public UUID getValue() {
        return value;
    }

    // equals & hashCode (VERY IMPORTANT for value objects)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskId)) return false;
        TaskId taskId = (TaskId) o;
        return Objects.equals(value, taskId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
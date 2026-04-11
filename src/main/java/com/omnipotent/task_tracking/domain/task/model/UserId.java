package com.omnipotent.task_tracking.domain.task.model;

import java.util.UUID;

// should be a long
public record UserId(String value) {
    public UserId {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("UserId cannot be null or blank");
        }
    }

    // 🔥 Factory method (preferred)
    public static UserId of(String value) {
        return new UserId(value);
    }

    // 🔥 Generate new ID (optional)
    public static UserId generate() {
        return new UserId(UUID.randomUUID().toString());
    }

    @Override
    public String toString() {
        return value;
    }
}
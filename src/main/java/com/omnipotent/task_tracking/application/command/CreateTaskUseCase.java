package com.omnipotent.task_tracking.application.command;

import com.omnipotent.task_tracking.domain.task.model.Task;

//Just call it CreateTask
public interface CreateTaskUseCase {
    Task create(CreateTaskCommand command);
}

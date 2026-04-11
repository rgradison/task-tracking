package com.omnipotent.task_tracking.domain.task.model.port.in;

import com.omnipotent.task_tracking.application.command.CreateTaskCommand;
import com.omnipotent.task_tracking.domain.task.model.Task;

public interface CreateTaskUseCase {
    Task create(CreateTaskCommand command);
}
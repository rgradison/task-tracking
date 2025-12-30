package com.omnipotent.task_tracking.domain.model.port.in;

import com.omnipotent.task_tracking.application.command.CreateTaskCommand;
import com.omnipotent.task_tracking.domain.model.Task;

public interface CreateTaskUseCase {
    Task create(CreateTaskCommand command);
}
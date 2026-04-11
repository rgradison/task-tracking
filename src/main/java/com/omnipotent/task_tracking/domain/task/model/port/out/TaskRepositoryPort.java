package com.omnipotent.task_tracking.domain.task.model.port.out;

import com.omnipotent.task_tracking.domain.task.model.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TaskRepositoryPort
{
    Task save(Task task);
    Page<Task> findAll(Pageable pageable);
}
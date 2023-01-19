package com.example.demo.Service;

import com.example.demo.Entity.TaskRequest;

import java.util.List;

public interface TaskService {
    List<TaskRequest> getAllTasks();
    void saveTask(TaskRequest taskRequest);
    TaskRequest getTaskId(long id);
    void deleteTaskById(long id);

}

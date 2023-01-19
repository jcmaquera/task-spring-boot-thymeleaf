package com.example.demo.Service;

import com.example.demo.Entity.TaskRequest;
import com.example.demo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;


    @Override
    public List<TaskRequest> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void saveTask(TaskRequest taskRequest) {
        this.taskRepository.save(taskRequest);
    }

    @Override
    public TaskRequest getTaskId(long id) {
        Optional<TaskRequest> optional = taskRepository.findById(id);
        TaskRequest taskRequest = null;
        if(optional.isPresent()){
            taskRequest = optional.get();
        } else {
            throw new RuntimeException(" Task not found for id :: " + id);
        }
        return taskRequest;
    }

    @Override
    public void deleteTaskById(long id) {
        this.taskRepository.deleteById(id);
    }

}

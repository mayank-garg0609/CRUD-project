package com.example.demo.Service;

import com.example.demo.API.Model.Task;

import java.util.List;

public interface TaskService {
    String createTask(Task task);
    List<Task> readTasks();
    boolean deleteTask(Long id);
    String updateTask(long id , Task task);
    Task readTask(Long id);
}

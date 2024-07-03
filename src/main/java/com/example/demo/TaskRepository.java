package com.example.demo;

import com.example.demo.Model.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}

package com.example.demo.Repository;

import com.example.demo.Entity.TaskRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskRequest, Long> {
}

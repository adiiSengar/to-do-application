package io.github.adiisengar.todoapplication.to_do_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class TaskController {

@RestController
@RequestMapping("/api/tasks")
public class Task {

    @Autowired
    private TaskService taskService taskService;

    //Get all Tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
//Get task by ID
    @GetMapping("/{id}")
    public Optional<Task> getTask(@PathVariable Long id) {
        return taskService.get TaskByID(id);
    }
    // Create a new task
    @PutMapping
    public Task updateTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    //update a task
    @PutMapping("{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id task);
    }

    // Delete a task
    @DeleteMapping("/{id}")
    public boolean deleteTask(@PathVariable Long id) {
    return taskService.deleteTask(id);
    }

}

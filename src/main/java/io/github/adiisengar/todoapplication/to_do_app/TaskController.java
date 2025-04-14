package io.github.adiisengar.todoapplication.to_do_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *This controller handles all the task-related API requests.
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    /**
     * // Injects the TaskService to handle business logic
     */
    @Autowired
    private TaskService taskService;

    /**
     * Get all tasks.
     * @return a list of all tasks
     */
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    /**
     * Get a specific task by its ID.
     * @param id the ID of the task to retrieve
     *      * @return the task if found, otherwise an empty Optional
     */
    @GetMapping("/id")
    public ResponseEntity<Task> getTask(@PathVariable Long id) {
        Optional<Task> task = taskService.getTaskById(id);
        return task.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    /**
     * * Create a new task.
     * This method handles HTTP POST requests and adds a new task to the system.
     * @param task The task details sent in the request body
     * @return The saved task with an auto-generated ID
     */
    @PostMapping
    public ResponseEntity <Task> createTask(@RequestBody Task task) {
        Task createdTask = taskService.saveTask(task);
        return ResponseEntity.ok(createdTask);
    }
    /**
     *Update a task.
     * @param id the ID of the task to update
     * @param task the updated task data
     * @return the updated task
     */
    @PutMapping("/id")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
        Task updatedTask = taskService.updateTask(id, task);
        if (updatedTask == null) {
            return ResponseEntity.ok(updatedTask);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Delete a task.
     * @param id the ID of the task to delete
     * @return true if the task was successfully deleted, false if not
     */
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        boolean deleted = taskService.deleteTask(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
        }
    }


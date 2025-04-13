package io.github.adiisengar.todoapplication.to_do_app;

import org.springframework.beans.factory.annotation.Autowired;
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
    public Optional<Task> getTask(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    /**
     *Update a task.
     * @param id the ID of the task to update
     * @param task the updated task data
     * @return the updated task
     */
    @PutMapping("/id")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    /**
     * Delete a task.
     * @param id the ID of the task to delete
     * @return true if the task was successfully deleted, false if not
     */
    @DeleteMapping("/id")
    public boolean deleteTask(@PathVariable Long id) {
    return taskService.deleteTask(id);
    }
}

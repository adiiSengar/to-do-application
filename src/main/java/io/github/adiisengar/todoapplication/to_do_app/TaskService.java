package io.github.adiisengar.todoapplication.to_do_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
/**
 * Service class that contains business logic for managing tasks.
 */

@Service

public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    /**
     * Get a list of all tasks.
     *
     * @return List of all tasks from the database
     */


    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    /**
     * Get a single task by its ID.
     *
     * @param id ID of the task to retrieve
     * @return Optional containing the task if found, otherwise empty
     */

    public Optional<Task> getTaskById(Long id) {

        return taskRepository.findById(id);
    }

    /**
     * Save a new task to the database.
     *
     * @param task Task object to save
     * @return Saved task object with generated ID
     */

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    /**
     * Update an existing task using its ID.
     *
     * @param id          ID of the task to update
     * @param taskDetails New task data to update
     * @return Updated task object if ID exists, otherwise null
     */

    public Task updateTask(Long id, Task taskDetails) {

        if (taskRepository.existsById(id)) {
            taskDetails.setId(id);
            return null;
        }
        /**
         * Delete a task using its ID.
         * @param id ID of the task to delete
         * @return true if task was deleted, false if task does not exist
         */

        return taskRepository.save(taskDetails);
    }

    public boolean deleteTask(Long id) {
        if (taskRepository.existsById(id)) {
            taskRepository.deleteById(id);
            return true;
        }
        return false;

    }
}





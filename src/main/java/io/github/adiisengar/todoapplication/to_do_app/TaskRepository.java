package io.github.adiisengar.todoapplication.to_do_app;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repository interface for performing CRUD operations on Task entities.
 */
public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Find tasks by their completion status.
     * @param completed the completion status of the tasks (true or false)
     * @return a list of tasks with the specified completion status
     */
    List<Task> findByCompleted(boolean completed);

    /**
     * Find tasks by their title.
     * @param title the title of the tasks
     * @return a list of tasks with the specified title
     */
    List<Task> findByTitleContainingIgnoreCase(String title);

    /**
     * Find tasks by title and completion status.
     * @param title the title of the tasks
     * @param completed the completion status of the tasks
     * @return a list of tasks matching the title and completion status
     */
    List<Task> findByTitleContainingIgnoreCaseAndCompleted(String title, boolean completed);

    /**
     * Delete tasks by their completion status.
     * @param completed the completion status of the tasks to be deleted
     */
    void deleteByCompleted(boolean completed);
}

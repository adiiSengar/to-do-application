package io.github.adiisengar.todoapplication.to_do_app;

import jakarta.persistence.*;

import java.util.Objects;

/**
 * This class represents a Task entity mapped to the 'tasks' table in the database.
 */
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean completed;

    public Task() {}

    /**
     * Constructor to initialize a task with values.
     * @param title the title of the task
     * @param description the description of the task
     * @param completed whether the task is completed or not
     */
    public Task(String title, String description, boolean completed) {
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    /**
     * Get the ID of the task.
     * @return task ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the task.
     * @param id task ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the title of the task.
     * @return task title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the title of the task.
     * @param title task title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the description of the task.
     * @return task description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the task.
     * @param description task description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Check if the task is completed.
     * @return true if completed, false otherwise
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Set the task's completion status.
     * @param completed true if completed, false otherwise
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * Compare this task to another object for equality.
     * @param o the object to compare
     * @return true if all fields match, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return completed == task.completed && Objects.equals(id, task.id) && Objects.equals(title, task.title) && Objects.equals(description, task.description);
    }

    /**
     *  Generate a hash code for the task.
     *  @return hash code based on task fields
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, completed);
    }

    /**
     * Return a string representation of the task.
     * @return string showing task details
     */
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }
}

package io.github.adiisengar.todoapplication.to_do_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service

public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

 public List<Task> getAllTasks() {
     return taskRepository.findAll();
 }
 public Optional<Task> getTaskById(Long id) {
     return taskRepository.findById(id);
 }
 public Task saveTask(Task task) {
     return taskRepository.save(task);
 }
 public void updateTask(Long id, Task taskDetails) {

     if (taskRepository.existsById(id)) {
         taskDetails.setId(id);
     }
     return null;
 }
     public boolean deleteTask(Long id){
         if(taskRepository.existsById(id)){
             taskRepository.deleteById(id);
             return true;
         }
         return false;
     }
}

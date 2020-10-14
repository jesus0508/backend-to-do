package pe.com.comsatel.basictodo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        return new ResponseEntity<>(
                taskService.getAllTasks(),
                HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Integer id) {

        return new ResponseEntity<>(
                taskService.getTaskById(id),
                HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createTask(@RequestBody Task task) {
        taskService.createTask(task);
        return new ResponseEntity<>(
                HttpStatus.CREATED
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Integer id, @RequestBody Task task) {
        taskService.updateTask(id, task);
        return new ResponseEntity<>(
                HttpStatus.OK
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Integer> deleteTask(@PathVariable Integer id) {
        taskService.deleteTask(id);
        return new ResponseEntity<>(
                id,
                HttpStatus.OK
        );
    }
}

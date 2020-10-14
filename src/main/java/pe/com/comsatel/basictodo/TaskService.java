package pe.com.comsatel.basictodo;

import java.util.List;
import java.util.Optional;

interface TaskService {
    List<Task> getAllTasks();

    Task getTaskById(Integer id);

    void createTask(Task task);

    void updateTask(Integer id, Task task);

    void deleteTask(Integer id);
}

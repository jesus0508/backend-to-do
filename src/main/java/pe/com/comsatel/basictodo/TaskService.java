package pe.com.comsatel.basictodo;

import java.util.List;

interface TaskService {
    List<Task> getAllTasks();

    Task getTaskById(Integer id);

    Task createTask(Task task);

    Task updateTask(Integer id, Task task);

    void deleteTask(Integer id);
}

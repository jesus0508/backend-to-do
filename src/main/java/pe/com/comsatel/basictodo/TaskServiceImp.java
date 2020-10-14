package pe.com.comsatel.basictodo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TaskServiceImp implements TaskService {

    List<Task> testTasks = new ArrayList<>(Arrays.asList(
            new Task(1, "Esta es una tarea1"),
            new Task(2, "Esta es una tarea2"),
            new Task(3, "Esta es una tarea3")
    ));

    @Override
    public List<Task> getAllTasks() {
        return testTasks;
    }

    @Override
    public Task getTaskById(Integer id) {
        assert id > 1;
        return testTasks.get(getIndex(id));
    }

    @Override
    public void createTask(Task task) {
        testTasks.add(task);
    }

    @Override
    public void updateTask(Integer id, Task task) {
        assert id > 1 && task != null;
        testTasks.get(getIndex(id)).setDescription(task.getDescription());
    }

    @Override
    public void deleteTask(Integer id) {
        assert id > 1;
        testTasks.remove(getIndex(id));
    }

    private int getIndex(Integer id) {
        return id - 1;
    }
}

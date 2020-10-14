package pe.com.comsatel.basictodo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TaskServiceImp implements TaskService {

    @Override
    public List<Task> getAllTasks() {
        return Arrays.asList(
                new Task("Esta es una tarea1"),
                new Task("Esta es una tarea2"),
                new Task("Esta es una tarea3")
        );
    }
}

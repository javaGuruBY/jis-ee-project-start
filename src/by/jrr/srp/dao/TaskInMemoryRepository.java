package by.jrr.srp.dao;

import by.jrr.srp.bean.Task;

import java.util.HashMap;
import java.util.Map;

public class TaskInMemoryRepository {

    private static long TASK_ID_SEQUENCE = 0;
    public static Map<Long, Task> tasks = new HashMap<>();

    public Task save(Task task) {
        task.setId(TASK_ID_SEQUENCE);
        tasks.put(TASK_ID_SEQUENCE, task);
        TASK_ID_SEQUENCE++;

        System.out.println("Task created, id: " + task.getId());
        return task;
    }

    public Task findById(long id) {
        return tasks.get(id);
    }
}

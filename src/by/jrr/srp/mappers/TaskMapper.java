package by.jrr.srp.mappers;

import by.jrr.srp.bean.Task;

public class TaskMapper {

    public static Task arrayToTaskMapper(String[] details) {
        Task task = new Task();
        task.setName(details[0]);
        task.setDescription(details[1]);
        return task;
    }
}

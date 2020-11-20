package by.jrr.srp.controllers;

import by.jrr.srp.bean.Task;
import by.jrr.srp.mappers.TaskMapper;
import by.jrr.srp.service.TaskService;
import by.jrr.srp.view.Menu;

public class CreateTaskProcess implements UIProcess {

    TaskService taskService;

    public CreateTaskProcess(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void run() {
        String[] taskDetails = Menu.getTaskDetailsFromUser();
        Task task = TaskMapper.arrayToTaskMapper(taskDetails);
        taskService.createTask(task);
    }
}

package by.jrr.srp.controllers;

import by.jrr.srp.bean.Task;
import by.jrr.srp.service.TaskService;
import by.jrr.srp.view.Menu;

public class FindTaskByIdProcess implements UIProcess {

    TaskService taskService;

    public FindTaskByIdProcess(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void run() {
        long id = Menu.getTaskIdFromUser();
        Task task2 = taskService.findById(id);
        Menu.printTaskDetails(task2);
    }
}

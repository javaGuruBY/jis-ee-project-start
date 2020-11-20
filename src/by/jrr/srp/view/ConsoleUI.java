package by.jrr.srp.view;

import by.jrr.srp.controllers.CreateTaskProcess;
import by.jrr.srp.controllers.FindTaskByIdProcess;
import by.jrr.srp.controllers.UIProcessor;
import by.jrr.srp.bean.MenuChoice;
import by.jrr.srp.service.TaskService;

public class ConsoleUI {

    TaskService taskService = new TaskService();
    UIProcessor uiProcessor = new UIProcessor();

    public void run() {
        while (true) {
            MenuChoice userInput = Menu.printMainMenu();
            try {
                switch (userInput) {
                    case CREATE_TASK:
                        uiProcessor.run(new CreateTaskProcess(taskService));
                        break;
                    case FIND_TASK:
                        uiProcessor.run(new FindTaskByIdProcess(taskService));
                        break;
                    case EXIT:
                        return;
                }
            } catch (Exception e) {
                Menu.printErrorMessage(e);
            }
        }
    }
}

package by.jrr.srp.service;

import by.jrr.srp.bean.Task;
import by.jrr.srp.dao.TaskInMemoryRepository;
import by.jrr.srp.validation.TaskDescriptionValidationRule;
import by.jrr.srp.validation.TaskNameValidationRule;
import by.jrr.srp.validation.TaskValidationRule;

import java.util.Set;

public class TaskService {

    private Set<TaskValidationRule> validationRules = Set.of(
            new TaskNameValidationRule(),
            new TaskDescriptionValidationRule());
    private TaskInMemoryRepository repository = new TaskInMemoryRepository();

    public Task createTask(Task task) {
        validationRules.forEach(rule -> rule.validate(task));
        return repository.save(task);
    }

    public Task findById(long id) {
        return repository.findById(id);
    }
}

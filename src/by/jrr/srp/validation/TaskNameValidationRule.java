package by.jrr.srp.validation;

import by.jrr.srp.bean.Task;

public class TaskNameValidationRule implements TaskValidationRule {
    @Override
    public void validate(Task task) {
        checkNotNull(task);
        if(task.getName() == null) {
            throw new IllegalArgumentException("Task name must not be null");
        }
    }
}

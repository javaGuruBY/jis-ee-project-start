package by.jrr.srp.validation;

import by.jrr.srp.bean.Task;

public class TaskDescriptionValidationRule implements TaskValidationRule {
    @Override
    public void validate(Task task) {
        checkNotNull(task);
        if(task.getDescription() == null
                || task.getDescription().isEmpty()
                || task.getDescription().isBlank()) {
            throw new IllegalArgumentException("Task description must not be null");
        }
    }
}

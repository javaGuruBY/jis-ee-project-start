package by.jrr.srp.validation;

import by.jrr.srp.bean.Task;

public interface TaskValidationRule {

    void validate(Task task) throws TaskValidationException;

    default void checkNotNull(Task task){
        if (task == null) {
            throw new TaskValidationException("Task must be not null");
        }
    }
}

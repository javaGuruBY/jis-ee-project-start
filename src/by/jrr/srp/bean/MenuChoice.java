package by.jrr.srp.bean;

public enum MenuChoice {
    BLANK,
    CREATE_TASK,
    FIND_TASK,
    EXIT;

    public static MenuChoice getByOrdinal(int ordinal){
        switch (ordinal) {
            case 1:
                return CREATE_TASK;
            case 2:
                return FIND_TASK;
            case 3:
                return EXIT;
            default:
                return BLANK;
        }
    }
}

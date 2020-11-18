import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    private static long TASK_ID_SEQUENCE = 0;

    public static void main(String[] args) {
        Map<Long, Task> tasks = new HashMap<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("1. Create task");
                System.out.println("2. Find task by id");
                System.out.println("3. Exit");
                int userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        createTask(tasks);
                        break;
                    case 2:
                        findTask(tasks);
                        break;
                    case 3:
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error! Please try again.");
            }
        }
    }

    private static void createTask(Map<Long, Task> tasks) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name: ");
        String name = scanner.nextLine();
        System.out.println("Enter task description: ");
        String description = scanner.nextLine();

        Task task = new Task();
        task.setName(name);
        task.setDescription(description);

        if(task.getName() == null) {
            throw new IllegalArgumentException("Task name must not be null");
        }

        task.setId(TASK_ID_SEQUENCE);
        tasks.put(TASK_ID_SEQUENCE, task);
        TASK_ID_SEQUENCE++;

        System.out.println("Task created, id: " + task.getId());

    }

    private static void findTask(Map<Long, Task> tasks) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task id: ");
        long id = scanner.nextLong();
        System.out.println(tasks.get(id));
    }

    private static class Task {

        String name;
        String description;
        private long id;

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}

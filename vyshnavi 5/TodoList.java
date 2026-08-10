```java
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public boolean removeTask(int taskNumber) {
        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            return true;
        }
        return false;
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("To-Do List is empty.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoList todo = new TodoList();

        int choice;

        do {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    todo.addTask(task);
                    System.out.println("Task added successfully.");
                    break;

                case 2:
                    System.out.print("Enter task number to remove: ");
                    int taskNumber = sc.nextInt();

                    if (todo.removeTask(taskNumber)) {
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 3:
                    todo.displayTasks();
                    break;

                case 4:
                    System.out.println("Exiting To-Do List.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
```

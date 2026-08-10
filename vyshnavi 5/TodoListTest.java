```java
public class TodoListTest {

    public static void main(String[] args) {

        TodoList todo = new TodoList();

        System.out.println("To-Do List Testbench");
        System.out.println("--------------------");

        // Test 1: Add tasks
        todo.addTask("Complete Java project");
        todo.addTask("Study for exam");
        todo.addTask("Submit assignment");

        System.out.println("Test 1: Add 3 tasks");
        System.out.println("Expected: 3 tasks");
        System.out.println("Actual: " + todo.getTaskCount() + " tasks");

        if (todo.getTaskCount() == 3) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println();

        // Test 2: Remove task
        boolean removed = todo.removeTask(2);

        System.out.println("Test 2: Remove task 2");
        System.out.println("Expected: Task removed");
        System.out.println("Actual: " + (removed ? "Task removed" : "Task not removed"));

        if (removed && todo.getTaskCount() == 2) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println();

        // Test 3: Invalid task number
        boolean invalidRemove = todo.removeTask(10);

        System.out.println("Test 3: Remove invalid task");
        System.out.println("Expected: Task not removed");
        System.out.println("Actual: " + (invalidRemove ? "Task removed" : "Task not removed"));

        if (!invalidRemove) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println();

        // Test 4: Display remaining tasks
        System.out.println("Test 4: Display remaining tasks");
        todo.displayTasks();
        System.out.println("PASS");
    }
}
```

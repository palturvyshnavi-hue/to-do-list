# To-Do List in Java

## Description

A simple To-Do List application developed using Java.

The program allows the user to:

* Add tasks
* Remove tasks
* Display tasks
* Exit the program

## Files

* `TodoList.java` - Main To-Do List program
* `TodoListTest.java` - Testbench
* `output.txt` - Testbench output
* `README.md` - Project documentation

## How to Run in VS Code

Compile:

```bash
javac TodoList.java TodoListTest.java
```

Run the To-Do List:

```bash
java TodoList
```

Run the testbench:

```bash
java TodoListTest
```

## Test Cases

| Test | Operation           | Expected Result           | Status |
| ---- | ------------------- | ------------------------- | ------ |
| 1    | Add 3 tasks         | 3 tasks                   | PASS   |
| 2    | Remove task 2       | Task removed              | PASS   |
| 3    | Remove invalid task | Task not removed          | PASS   |
| 4    | Display tasks       | Remaining tasks displayed | PASS   |

## Expected Output

```text
To-Do List Testbench
--------------------
Test 1: Add 3 tasks
Expected: 3 tasks
Actual: 3 tasks
PASS

Test 2: Remove task 2
Expected: Task removed
Actual: Task removed
PASS

Test 3: Remove invalid task
Expected: Task not removed
Actual: Task not removed
PASS

Test 4: Display remaining tasks
To-Do List:
1. Complete Java project
2. Submit assignment
PASS
```

## Conclusion

The Java To-Do List application was successfully implemented and tested. The testbench verifies adding tasks, removing tasks, handling invalid task numbers, and displaying the remaining tasks.

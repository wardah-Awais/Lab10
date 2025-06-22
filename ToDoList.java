package tasks;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void viewTasks() {
        System.out.println("Your Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void updateTask(int index, String newTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newTask);
            System.out.println("Task updated.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Removed: " + tasks.remove(index));
        } else {
            System.out.println("Invalid task index.");
        }
    }

    
    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        todo.addTask("Do homeowrk");
        todo.viewTasks();
        todo.updateTask(0, "Complete Q5 task (edited)");
        todo.viewTasks();
        todo.removeTask(0);
        todo.viewTasks();

    }
}

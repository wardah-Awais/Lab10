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

    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        todo.addTask("Do homeowrk");
        todo.viewTasks();
    }
}

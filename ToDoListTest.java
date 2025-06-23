package tasks;

import static org.junit.Assert.*;
import org.junit.Test;

public class ToDoListTest {

    @Test
    public void testAddTask() {
        ToDoList list = new ToDoList();
        list.addTask("Read book");
        assertEquals("Read book", list.getTasks().get(0));
    }

    @Test
    public void testUpdateTask() {
        ToDoList list = new ToDoList();
        list.addTask("Old Task");
        list.updateTask(0, "New Task");
        assertEquals("New Task", list.getTasks().get(0));
    }

    @Test
    public void testRemoveTask() {
        ToDoList list = new ToDoList();
        list.addTask("Delete me");
        list.removeTask(0);
        assertEquals(0, list.getTasks().size());
    }
}

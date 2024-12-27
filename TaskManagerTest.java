package test;

import main.TaskManager;
import org.junit.Test;
import static org.junit.Assert.*;

public class TaskManagerTest {
    @Test
    public void testAddTask() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Learn Java");
        assertTrue(taskManager.getTasks().contains("Learn Java"));
    }
    @Test
    public void testRemoveTask() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Learn Java");
        taskManager.removeTask("Learn Java");
        assertFalse(taskManager.getTasks().contains("Learn Java"));
    }
    @Test
    public void testGetTasks() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Task 1");
        taskManager.addTask("Task 2");
        assertEquals(2, taskManager.getTasks().size());
    }
}

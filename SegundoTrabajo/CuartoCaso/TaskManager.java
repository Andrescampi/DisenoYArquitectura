package CuartoCaso;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public boolean deleteTask(Task task) {
        return tasks.remove(task);
    }

    public void showTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

}

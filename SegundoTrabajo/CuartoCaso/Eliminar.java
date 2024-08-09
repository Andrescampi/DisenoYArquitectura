package CuartoCaso;

public class Eliminar extends Gestion {
    private TaskManager taskManager;

    public Eliminar(Task task, TaskManager taskManager) {
        super(task);
        this.taskManager = taskManager;
    }

    @Override
    public boolean execute() {
        backup(); 
        return taskManager.deleteTask(task);
    }

    @Override
    public void undo() {
        super.undo(); 
        taskManager.addTask(task);
    }
}



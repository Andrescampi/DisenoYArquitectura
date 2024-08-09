package CuartoCaso;

public class Crear extends Gestion {
    private TaskManager taskManager;
    private Historial historial;

    public Crear( Task task, TaskManager taskManager, Historial historial){
super(task);
this.taskManager= taskManager;
this.historial= historial;

    }

    @Override
    public boolean execute() {
        taskManager.addTask(task);
        historial.push(this); 
        return true;
    }

    @Override
    public void undo() {
        taskManager.deleteTask(task);
    }
}

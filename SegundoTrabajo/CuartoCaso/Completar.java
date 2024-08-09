package CuartoCaso;

public class Completar extends Gestion {
    
    private TaskManager taskManager;
    private Historial historial;
    private String previousState;
    
    public Completar(Task task, TaskManager taskManager, Historial historial, String previosState){
        super(task);
        this.taskManager=taskManager;
        this.historial=historial;
        this.previousState=previousState;
    }


    @Override
    public boolean execute() {
        backup(); 
        previousState = task.getState(); 
        task.setState("completada"); 
        historial.push(this); 
        return true;
    }

    @Override
    public void undo() {
        task.setState(previousState);
    }
    
}

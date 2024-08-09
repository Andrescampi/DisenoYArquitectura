package CuartoCaso;
public class Editar extends Gestion {
    private TaskManager taskManager;
    private Historial historial;
    private String newName;
    private String newDescription;
    private String newState;

    public Editar( Task task, TaskManager taskManager, Historial historial, String newName, String newDescription, String newstate){
super(task);
this.historial= historial;
this.newName=newName;
this.newDescription=newDescription;
this.newState=newstate;

    }

    @Override
    public boolean execute() {
        backup(); 
        task.setName(newName);
        task.setDescription(newDescription);
        task.setState(newState);
        historial.push(this); 
        return true;
    }

    @Override
    public void undo() {
        super.undo();
    }

}

package CuartoCaso;

public abstract class Gestion {
    protected Task task;
    private Task backup;

    Gestion(Task task) {
        this.task = task;
    }

    void backup() {
        backup = new Task(task.getName(), task.getDescription(), task.getState());
    }

    public void undo() {
        if (backup != null) {
            task.setName(backup.getName());
            task.setDescription(backup.getDescription());
            task.setState(backup.getState());
        }
    }
    public abstract boolean execute();
}



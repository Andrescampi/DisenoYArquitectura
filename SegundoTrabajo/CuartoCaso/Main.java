package CuartoCaso;

public class Main {
    
        public static void main(String[] args) {
            TaskManager taskManager = new TaskManager();
            Historial historial = new Historial();
    
            Task tarea1 = new Task("Comprar leche", "Ir al supermercado y comprar leche", "pendiente");
            Task tarea2 = new Task("Hacer ejercicio", "Correr 5 kilómetros", "pendiente");

            Crear crearTarea1 = new Crear(tarea1, taskManager, historial);
            Crear crearTarea2 = new Crear(tarea2, taskManager, historial);
            crearTarea1.execute();
            crearTarea2.execute();
    
            Completar completarTarea2 = new Completar(tarea2, taskManager, historial, " ");
            completarTarea2.execute();
    
            System.out.println("Tareas actuales:");
            taskManager.showTasks();
            Editar editarTarea1 = new Editar(tarea1, taskManager, historial, "Comprar pan", "Ir a la panadería", "pendiente");
            editarTarea1.execute();
            
    
            System.out.println("\nTareas después de deshacer la última acción:");
            taskManager.showTasks();

            historial.pop();
           System.out.println("Eliminr tarea 1");
            taskManager.deleteTask(tarea1);
            taskManager.showTasks();
            tarea1.setState("");
            taskManager.showTasks();

        }
    
}

package QuintoCaso;

public class Main {
    public static void main(String[] args) {
        Habitacion habitacion = new HabitacionBasica();
        habitacion = new AgregarDispositivos(habitacion);
        habitacion = new AgregarDecoracion(habitacion);
        habitacion.agregar();
    }
}

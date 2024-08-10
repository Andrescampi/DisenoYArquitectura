package QuintoCaso;

public class HabitacionBasica implements Habitacion{
    int cuarto = (int)(Math.random()*100+1);
    @Override
    public void agregar() {
        System.out.println("Decoración básica de la habitación "+cuarto);
    }
}

package QuintoCaso;

public abstract class Adicionar implements Habitacion {
    protected Habitacion habitacion;

    public Adicionar(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public void agregar() {
        habitacion.agregar();
    }
}

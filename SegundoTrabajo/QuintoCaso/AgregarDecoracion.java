package QuintoCaso;

public class AgregarDecoracion extends Adicionar {
    public AgregarDecoracion(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public void agregar() {
        super.agregar();
        System.out.println("La decoración solicitada fue agregada a su plan de hospedaje");
    }
}

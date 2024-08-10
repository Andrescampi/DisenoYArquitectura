package QuintoCaso;

public class AgregarComida extends Adicionar {
    public AgregarComida(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public void agregar() {
        super.agregar();
        System.out.println("La comida solicitada fue agregada a su plan de hospedaje");
    }
}

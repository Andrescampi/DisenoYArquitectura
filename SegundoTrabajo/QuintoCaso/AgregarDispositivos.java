package QuintoCaso;

public class AgregarDispositivos extends Adicionar {
    public AgregarDispositivos(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public void agregar() {
        super.agregar();
        System.out.println("Los dispositivos inteligentes han sido agregados con exito");
    }
}

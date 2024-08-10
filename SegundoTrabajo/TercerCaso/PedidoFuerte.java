package TercerCaso;

public class PedidoFuerte extends Pedido {
    
    private int cantidadDisponible;
    private int precioBebida;

    public PedidoFuerte(int cantidadDisponible, int precioBebida) {
        this.cantidadDisponible = cantidadDisponible;
        this.precioBebida=precioBebida;
    }

    @Override
    void calcularPrecio() {
        System.out.println("Calculando precio del plato fuerte");
        {
            if (disponible) {
                precio = precioBebida;
                mostrarPrecio();
            } else {
                System.out.println("No se puede calcular el precio porque no hay almuerzos.");
            }
        }
        
    }

     @Override
    void verificarDisponibilidad() {
        if (cantidadDisponible > 0) {
            disponible = true;
            System.out.println("Si hay almuerzos");
        } else {
            disponible = false;
            System.out.println("No hay almuerzos disponibles.");
        }
        
}

    @Override
    void prepararPedido() {
        System.out.println("Preparando Almuerzo");

    }
    @Override
    void recibirPedido() {
        System.out.println("Recibiendo Orden.");

    }


    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
}

package TercerCaso;

public class PedidoBebida extends Pedido {
    private int cantidadDisponible;
    private int precioBebida;

    public PedidoBebida(int cantidadDisponible, int precioBebida) {
        this.cantidadDisponible = cantidadDisponible;
        this.precioBebida=precioBebida;
    }

    @Override
    void calcularPrecio() {
        System.out.println("Calculando precio de la Bebida");
        {
            if (disponible) {
                precio = precioBebida;
                mostrarPrecio();
            } else {
                System.out.println("No se puede calcular el precio porque la bebida no está disponible.");
            }
        }
        
    }

     @Override
    void verificarDisponibilidad() {
        if (cantidadDisponible > 0) {
            disponible = true;
            System.out.println("Bebida disponible.");
        } else {
            disponible = false;
            System.out.println("No hay bebidas disponibles.");
        }
        
}

    @Override
    void prepararPedido() {
        System.out.println("Preparando Bebida");

    }
    @Override
    void recibirPedido() {
        System.out.println("Recibiendo Orden.");

    }


    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

}

    

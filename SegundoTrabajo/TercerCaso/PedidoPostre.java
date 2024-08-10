package TercerCaso;

public class PedidoPostre extends Pedido {

    private int cantidadDisponible;
    private int precioBebida;

    public PedidoPostre(int cantidadDisponible, int precioBebida) {
        this.cantidadDisponible = cantidadDisponible;
        this.precioBebida=precioBebida;
    }

    @Override
    void calcularPrecio() {
        
        {
            if (disponible) {
                System.out.println("Calculando precio del postre");
                precio = precioBebida;
                mostrarPrecio();
            } else {
                System.out.println(" ");
            }
        }
        
    }

     @Override
    void verificarDisponibilidad() {
        if (cantidadDisponible > 0) {
            disponible = true;
            System.out.println("postre disponible.");
        } else {
            disponible = false;
            System.out.println("No hay postres hoy.");
        }
        
}

    @Override
    void prepararPedido() {
        System.out.println("Preparando postre");

    }
    @Override
    void recibirPedido() {
        System.out.println("Recibiendo Orden.");

    }


    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
}

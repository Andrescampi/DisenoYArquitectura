package TercerCaso;

public abstract class Pedido {
    protected boolean disponible;  
    protected double precio;      

    public void procesarPedido() {
        recibirPedido();
        prepararPedido();
        verificarDisponibilidad();
        calcularPrecio();
    }

    void recibirPedido() {
    }

    abstract void prepararPedido();

    void verificarDisponibilidad() {
    }

    abstract void calcularPrecio();

    protected void mostrarPrecio() {
        System.out.println("El precio total es: " + precio);
    }
}


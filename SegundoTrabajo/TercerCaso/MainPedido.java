package TercerCaso;

public class MainPedido {
    public static void main(String[] args) {
        Pedido pedido = new PedidoFuerte(12,19);
        pedido.procesarPedido();
        Pedido pedidoBebida = new PedidoBebida(1,3);
        Pedido PedidoPostre= new PedidoPostre(0,20);
        pedidoBebida.procesarPedido();
        PedidoPostre.procesarPedido();
        System.out.println();
    }
}

package SegundoCaso;

class Emisor implements Dispositivo {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Nuevo mensaje recibido: " + mensaje);
    }
}

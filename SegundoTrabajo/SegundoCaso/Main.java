package SegundoCaso;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Emisor dispositivo1 = new Emisor();
        Emisor dispositivo2 = new Emisor();

        usuario.agregarDispositivo(dispositivo1);
        usuario.agregarDispositivo(dispositivo2);

        usuario.setMensaje("Hola desde el servidor!");

    }
}

package SegundoCaso;

import java.util.ArrayList;
import java.util.List;


class Usuario {
    private List<Dispositivo> dispositivos = new ArrayList<>();
    private String mensaje;

    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void eliminarDispositivo(Dispositivo dispositivo) {
        dispositivos.remove(dispositivo);
    }

    public void notificarDispositivo() {
        for (Dispositivo dispositivo : dispositivos) {
            dispositivo.actualizar(mensaje);
        }
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        notificarDispositivo();
    }
}

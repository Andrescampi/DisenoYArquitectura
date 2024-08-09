package SegundoCaso;

public class Main {
    public static void main(String[] args) {
        Subject usuario = new Subject();
        ConcreteObserver dispositivo1 = new ConcreteObserver();
        ConcreteObserver dispositivo2 = new ConcreteObserver();

        usuario.agregarDispositivo(dispositivo1);
        usuario.agregarDispositivo(dispositivo2);

        usuario.setMensaje("Hola desde el servidor!");

    }
}

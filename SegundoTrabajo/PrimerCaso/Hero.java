package PrimerCaso;

public class Hero {
public static void main(String[] args) {
    Prototype jugador = new Mago("orus","flaco", 2,4,0);
    System.out.println(jugador.heroinfo());
    Prototype jugadorclone = jugador;
    System.out.println(jugadorclone.heroinfo());
    jugadorclone.setApariencia("gordo");
    jugadorclone.setName("Diego");

System.out.println(jugadorclone.heroinfo());

}
    
} 

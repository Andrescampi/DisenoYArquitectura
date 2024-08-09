package PrimerCaso;

public class Guerrero implements Prototype{

    private String name;
    private String apariencia;
    private String hero= "Guerrero";
    private String ataque = "Espinas de hielo";
    private String defensa = "Movimiento giratorio";
    private String habilidad = "resplandor del fenix";
    private int experiencia;
    private int nivel;
    private int puntos;
    
    public Guerrero(String name, String apariencia, int experiencia, int nivel, int puntos){
        this.name=name;
        this.apariencia =apariencia;
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.puntos = puntos;
    }
    public Guerrero (Guerrero target){
        if (target != null) {
            this.name=name;
            this.apariencia =apariencia;
            this.experiencia = experiencia;
            this.nivel = nivel;
            this.puntos =  puntos++;
        }
    }
    @Override
    public String heroinfo() {
    return "\n Hero info"+ 
    "\n Hero: "+ hero +
    "\n Ataque: "+ ataque+
    "\n Defensa:  "+defensa+
    "\n Habilidad: "+ habilidad+
    "\n Nombre: "+ this.name+
    "\n Apariencia: "+ this.apariencia +
    "\n nivel: "+this.nivel+
    "\n Experiencia: "+ this.experiencia+
    "\n Puntos: "+ this.puntos;
    }
    @Override
   public Prototype clone(){
    return new Guerrero(this);
   }
   
    @Override
    public String getName() {
       return name;
    }
    @Override
    public void setName(String name) {
       this.name= name;
    }
    @Override
    public String getApariencia() {
        return apariencia;
    }
    @Override
    public void setApariencia(String apariencia) {
        this.apariencia= apariencia;
    }
    @Override
    public int getNivel() {
       return nivel;
    }
    @Override
    public void setNivel(int nivel) {
        this.nivel=nivel++;
    }
    @Override
    public int getExperiencia() {
        return experiencia;
    }
    @Override
    public void setExpeeriencia(int experiencia) {
        this.experiencia= experiencia;
    }
    @Override
    public int getPuntos() {
        return puntos;
    }
    @Override
    public void setPuntos(int puntos) {
        this.puntos=puntos;
    }
    @Override
    public String getAtaque() {
        return ataque;
    }
    @Override
    public String getDefensa() {
        return defensa;
    }
    @Override
    public String getHabilidad() {
        return habilidad;
    }
    @Override
    public String getHeroo() {
        return hero;
    }


   
    
}

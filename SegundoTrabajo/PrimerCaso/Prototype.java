package PrimerCaso;

public interface Prototype {
    Prototype clone();
    String heroinfo();


    String getName();
    void setName(String name);

    String getApariencia();
    void setApariencia(String apariencia);

    int getNivel();
    void setNivel(int nivel);

    int getExperiencia();
    void setExpeeriencia(int experiencia);
    
    int getPuntos();
    void setPuntos(int puntos);
    
    String getAtaque();
    String getDefensa();
    String getHabilidad();
    String getHeroo();


}

package Unidad3.Ejercicio10_12;

public class Guerrero {
    private int vida;
    private int experiencia;
    private int nivel;

    //Constructor
    public Guerrero(){
        setVida(20);
        setExperiencia(0);
        setNivel(1);
    }

    //Métodos
    public int atacar(){
        int danio; int danioTotal = 0;
        for (int i = 1; i<=nivel;i++){
            danio = (int)(Math.random()*6+1);
            danioTotal += danio;
        }
        return danioTotal;
    }
    public void recibirDanio(int danio){
        vida -= danio;
    }
    public void incExperiencia(int expGanda){
        experiencia += expGanda;
        if (experiencia < 8 ){
            nivel = 1;
        } else if (experiencia < 17) {
            nivel = 2;
        }else{
            nivel = 3;
        }
    }

    //Getters y Setters
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    @Override
    public String toString() {
        return "Guerrero{" +
                "vida=" + vida +
                ", experiencia=" + experiencia +
                ", nivel=" + nivel +
                '}';
    }
}

package Unidad3.EjercicioDefensaUT3.Ejercicio1;

public class JuegoBinario {
    byte objetivo;
    int pistasGanadas;
    int pistas1;
    int pistas2;
    // Constructor
    public JuegoBinario(){
        setObjetivo((byte)(Math.random()*63));
    }


    // Métodos
    public void pistaUno(byte byteDado){

    }

    public void pistaDos(byte byteDado){

    }


    // Getter y setters
    public void setObjetivo(byte objetivo) {
        this.objetivo = objetivo;
    }
}

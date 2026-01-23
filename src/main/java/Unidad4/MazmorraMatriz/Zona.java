package Unidad4.MazmorraMatriz;

import java.util.Arrays;

public class Zona {
    private int nivel;
    private boolean jefe;
    private Carta[][] cartas;

    // Constructor
    public Zona(int nivel, boolean jefe){
        setNivel(nivel);
        setJefe(jefe);
        setCartas();
    }


    // Metodos
    public void rellenarZona(Carta[] baraja){
        int numerosGuardados = 8;

        // Extrae 4 elementos aleatorios del array;
        if (baraja.length > 8){
            for (int i = baraja.length-1 ; i >= numerosGuardados ; i--){
                baraja[(int)(Math.random()*i)] = baraja[i];
                baraja[i] = null;
            }
        }

        // Shuffler;
        for (int i = 0 ; i < numerosGuardados ; i++){
            int numeroAleatorio = (int)(Math.random()*numerosGuardados);
            Carta aux = baraja[numeroAleatorio];
            baraja[numeroAleatorio] = baraja[i];
            baraja[i] = aux;
        }

        // Transforma el array[] en matriz (array[][]);
        for (int i = 0, j = 0, h = 0; i < numerosGuardados; i++){
            cartas[j][h] = baraja[i];
            h++;
            if (h == 3){
                h = 0;
                j++;
            }
        }
        cartas[2][2] = new Carta("amo");
    }




    // getter y setters
    public Carta[][] getCartas() {
        return cartas;
    }
    public void setCartas() {
        cartas = new Carta[3][3];
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setJefe(boolean jefe) {
        this.jefe = jefe;
    }
    public int getNivel() {
        return nivel;
    }
    public boolean isJefe() {
        return jefe;
    }
}

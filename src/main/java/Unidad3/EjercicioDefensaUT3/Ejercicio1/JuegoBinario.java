package Unidad3.EjercicioDefensaUT3.Ejercicio1;

public class JuegoBinario {
    private byte Objetivo;
    private int pistasGastadas;
    private int pistas1;
    private int pistas2;

    // Constructor
    public JuegoBinario(){
        setObjetivo((byte)(Math.random()*63));
    }

    // Métodos

    public boolean pistaUno(byte byteDado, int objetivo){
        int numUnosOBJETIVO = 0;
        int numUnosNum = 0;
        for (int i = 0; i < 6; i++){
            if ((objetivo & (1 << i)) != 0){
                numUnosOBJETIVO++;
            }
        }

        for (int i = 0; i < 6; i++){
            if ((byteDado & (1 << i)) != 0){
                numUnosNum++;
            }
        }
        pistas1++;
        pistasGastadas++;
        return numUnosOBJETIVO==numUnosNum;
    }

    public int pistaDos(byte byteDado, int objetivo){
        int numerosAcertados = 0;
        for (int i = 0; i < 6; i++){
            if ((objetivo & (1 << i)) == (byteDado & (1 << i))){
                numerosAcertados++;
            }
        }
        pistas2++;
        pistasGastadas++;
        return numerosAcertados;
    }

    // Getter y setters
    public void setObjetivo(byte objetivo) {
        Objetivo = objetivo;
    }
    public byte getObjetivo() {
        return Objetivo;
    }

    public int getPistas1() {
        return pistas1;
    }
    public int getPistas2() {
        return pistas2;
    }
    public int getPistasGastadas() {
        return pistasGastadas;
    }
}

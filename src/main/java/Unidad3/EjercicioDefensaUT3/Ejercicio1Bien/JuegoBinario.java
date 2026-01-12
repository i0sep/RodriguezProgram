package Unidad3.EjercicioDefensaUT3.Ejercicio1Bien;

public class JuegoBinario {
    private byte Objetivo;
    private static int pistasGastadas;
    private static int pistas1;
    private static int pistas2;

    // Constructor
    public JuegoBinario(){
        setObjetivo((byte)(Math.random()*63));
    }

    // Métodos

    public static boolean pistaUno(byte byteDado, int objetivo){
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
        return numUnosOBJETIVO==numUnosNum;
    }

    public static int pistaDos(byte byteDado, int objetivo){
        int numerosAcertados = 0;
        for (int i = 0; i < 6; i++){
            if ((objetivo & (1 << i)) == (byteDado & (1 << i))){
                numerosAcertados++;
            }
        }
        return numerosAcertados;
    }


    // Getter y setters
    public void setObjetivo(byte objetivo) {
        Objetivo = objetivo;
    }
    public byte getObjetivo() {
        return Objetivo;
    }

    public static int getPistas1() {
        return pistas1;
    }
    public static int getPistas2() {
        return pistas2;
    }
    public static int getPistasGastadas() {
        return pistasGastadas;
    }
    public static void setPistas1(int pistas1) {
        JuegoBinario.pistas1 = pistas1;
    }
    public static void setPistas2(int pistas2) {
        JuegoBinario.pistas2 = pistas2;
    }
    public static void setPistasGastadas(int pistasGastadas) {
        JuegoBinario.pistasGastadas = pistasGastadas;
    }
}

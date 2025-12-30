package Unidad0.Ej3d;

public class Terrestre extends Vehiculos{
    private int numeroRuedas;
    private int caballos;

    public Terrestre(int caballos, int numeroRuedas, int peso, String modelo){
        super(peso, modelo, "Terrestre");
        setNumeroRuedas(numeroRuedas);
        setCaballos(caballos);
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
}

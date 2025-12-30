package Unidad0.Ej3d;

public class Aereos extends Vehiculos{
    private int nHelices;

    public Aereos(int nHelices, int peso, String modelo){
        super(peso, modelo, "Acuatico");
        setsHelices(nHelices);
    }

    public void setsHelices(int nHelices) {
        this.nHelices = nHelices;
    }
}

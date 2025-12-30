package Unidad0.Ej3d;

public class Acuatico extends Vehiculos{
    private int caballosVapor;

    public Acuatico(int caballosVapor, int peso, String modelo){
        super(peso, modelo, "Acuatico");
        setCaballosVapor(caballosVapor);
    }

    public void setCaballosVapor(int caballosVapor) {
        this.caballosVapor = caballosVapor;
    }
}

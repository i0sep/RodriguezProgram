package Unidad0.Ej3d;

public class TerrestreCombustible extends Terrestre implements Combustible{

    public TerrestreCombustible(int caballos, int numeroRuedas, int peso, String modelo) {
        super(caballos, numeroRuedas, peso, modelo);
    }
    @Override
    public void llenarDeposito(int cantidad) {
        System.out.println("Has llenado el deposito");
    }
    @Override
    public void consumirCombustible(int cantidad) {
        System.out.println("Has consumido el deposito de ");
    }
}

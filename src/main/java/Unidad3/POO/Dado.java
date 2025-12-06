package Unidad3.POO;

public class Dado {
    public int valor;
    private int tiradaMax;

    public Dado() {
        this(6);
    }
    public Dado(int tiradaMax){
        setValor(1);
        setTiradaMax(tiradaMax);
    }


    public int lanzar() {
        this.valor = (int) (Math.random() * this.tiradaMax) + 1;
        return this.valor;
    }

    public static int sumaDados(Dado dado1, Dado dado2){
        int suma = dado1.lanzar() + dado2.lanzar();
        return suma;
    }


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTiradaMax() {
        return tiradaMax;
    }

    public void setTiradaMax(int tiradaMax) {
        this.tiradaMax = tiradaMax;
    }
    @Override
    public String toString() {
        String salida = "Valor actual del dado: " + valor + ". Tirada máxima del dado: "+ tiradaMax;
        return salida;
    }
}

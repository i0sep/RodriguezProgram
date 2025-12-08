package Unidad4.OtrasCosas.BlackJack;

public class Carta {
    private String palo;
    private String valor;

    //constructor
    public Carta(String palo, String valor){
        setPalo(palo);
        setValor(valor);
    }

    //metodos




    //getter y setter
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Carta{" +
                "palo='" + palo + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}

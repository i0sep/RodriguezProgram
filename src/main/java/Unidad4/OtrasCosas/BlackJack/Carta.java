package Unidad4.OtrasCosas.BlackJack;

public class Carta {
    private String palo;                //"Corazones", "Diamantes", "Tréboles", "Picas"
    private String simbolo;             //"A", "2", "3", "4", "5", "6", "7","8","9","10","J","Q","K"

    //constructor
    public Carta(String palo, String simbolo){
        setPalo(palo);
        setSimbolo(simbolo);
    }

    //metodos
    public int valor(){
        int valor = 0;
        switch (simbolo){
            case "A":
                valor = 11;
                break;
            case "2":
                valor = 2;
                break;
            case "3":
                valor = 3;
                break;
            case "4":
                valor = 4;
                break;
            case "5":
                valor = 5;
                break;
            case "6":
                valor = 6;
                break;
            case "7":
                valor = 7;
                break;
            case "8":
                valor = 8;
                break;
            case "9":
                valor = 9;
                break;
            case "10","J","Q","K":
                valor = 10;
                break;
        }
        return valor;
    }



    //getter y setter
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }
    public String getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    @Override
    public String toString() {
        return "Carta{" +
                "palo='" + palo + '\'' +
                ", valor='" + simbolo + '\'' +
                '}';
    }
}

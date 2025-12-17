package Unidad3.Tanda1.Ejercicio6;

public class CartaPueblo {
    private int numero;         // de 2 - 10
    private String palo;        // "Corazones", "Diamantes", "Tréboles", "Picas".

    //Constructores
    public CartaPueblo(int numero, String palo){
        setNumero(numero);
        setPalo(palo);
    }

    //metodos
    public int calcularDanio(){
        int danio;
        if (palo.equalsIgnoreCase("treboles") ||
                palo.equalsIgnoreCase("tréboles")){
            danio = numero*2;
        }else danio = numero;
        return danio;
    }
    public String obtenerEfecto(){
        String efecto;
        if (palo.equalsIgnoreCase("corazones")){
            efecto = "Curación";
        }else if (palo.equalsIgnoreCase("treboles") ||
                palo.equalsIgnoreCase("tréboles")){
            efecto = "Daño Extra";
        } else if (palo.equalsIgnoreCase("diamantes")){
            efecto = "Robar cartas";
        } else if (palo.equalsIgnoreCase("picas")){
            efecto = "Escudo";
        }else efecto = "NONE";
        return efecto;
    }


    //getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        if (palo.equalsIgnoreCase("treboles")
                || palo.equalsIgnoreCase("tréboles")
                || palo.equalsIgnoreCase("picas")
                || palo.equalsIgnoreCase("diamantes")
                || palo.equalsIgnoreCase("corazones")){
            this.palo = palo;
        }else {
            this.palo = "picas";
        }
    }
    @Override
    public String toString() {
        return "CartaPueblo{" +
                "numero=" + numero +
                ", palo='" + palo + '\'' +
                '}';
    }
}

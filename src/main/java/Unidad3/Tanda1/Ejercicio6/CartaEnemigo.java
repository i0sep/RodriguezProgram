package Unidad3.Tanda1.Ejercicio6;

public class CartaEnemigo {
    private String nombre;
    private int vida;
    private int ataque;

    //Constructor
    public CartaEnemigo(String nombre, int vida, int ataque) {
        setNombre(nombre);
        setVida(vida);
        setAtaque(ataque);
    }


    //Metodos
    public void recibirDanio(int damage){
        setVida(vida-damage);
    }
    public boolean estaDerrotado(){
        boolean derrotado;
        if (vida >= 0){
            derrotado = false;
        }else derrotado = true;
        return derrotado;
    }
    public int atacar(){
        return ataque;
    }


    //Setter y getter

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    @Override
    public String toString() {
        return "CartaEnemigo{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                '}';
    }
}

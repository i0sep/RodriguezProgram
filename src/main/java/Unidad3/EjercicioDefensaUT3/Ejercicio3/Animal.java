package Unidad3.EjercicioDefensaUT3.Ejercicio3;

public class Animal {
    private int vida;
    private int ataque;
    private String nombre;

    //Constructor
    public Animal(String nombre, int vida, int ataque){
        setAtaque(ataque);
        setVida(vida);
        setNombre(nombre);
    }

    //metodos
    public int atacar(){
        return ataque;
    }
    public void recibirDano(int ataque){
        setVida(vida-ataque);
        isAlive();
    }
    public boolean isAlive(){
        return vida > 0;
    }


    //getter y setters
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getNombre() {
        return nombre;
    }
    public int getVida() {
        return vida;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "vida=" + vida +
                ", ataque=" + ataque +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

package Unidad3.Tanda1.Ejercicio6;

public class Jugador {
    private String nombre;
    private CartaPueblo mano;

    //constructor
    public Jugador(String nombre, CartaPueblo mano){
        setNombre(nombre);
        setMano(mano);
    }

    //metodos
    public int jugarCarta(){
        return mano.calcularDanio();
    }
    public void recibirDanio(int danio){
        System.out.println(nombre+" ha recibido "+ danio + " de daño.");
    }


    //setter and getter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public CartaPueblo getMano() {
        return mano;
    }
    public void setMano(CartaPueblo mano) {
        this.mano = mano;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", mano=" + mano +
                '}';
    }
}

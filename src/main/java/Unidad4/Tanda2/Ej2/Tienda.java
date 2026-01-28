package Unidad4.Tanda2.Ej2;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Videojuego> inventario;
    // Constructor
    public Tienda(String nombre, ArrayList<Videojuego> inventario){
        setNombre(nombre);
        setInventario(inventario);
    }

    //Metodos
    public boolean agregarVideojuego(Videojuego juego){
        return inventario.add(juego);
    }
    public ArrayList<Videojuego> buscarPorGenero(eGenero genero){
        ArrayList<Videojuego> filtrado = new ArrayList<Videojuego>();
        for (int i = 0; i < inventario.size() ; i++){
            if (inventario.get(i).getGenero() == genero){
                filtrado.add(inventario.get(i));
            }
        }
        return  filtrado;
    }
    public void venderVideojuego(String titulo){
        for (int i = 0; i < inventario.size() ; i++){
            if (inventario.get(i).getTitulo().equalsIgnoreCase(titulo)){
                inventario.remove(inventario.get(i));
                break;
            }
        }
    }



    //getter y setters
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    public void setInventario(ArrayList<Videojuego> inventario) {
        this.inventario = inventario;
    }
    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", inventario=" + inventario +
                '}';
    }
}

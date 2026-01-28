package Unidad4.Tanda2.Ej2;

import java.util.ArrayList;

enum eGenero{
    ACCION,
    AVENTURA,
    RPG
}
public class Main {
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("Juego1", eGenero.ACCION,50);
        Videojuego juego2 = new Videojuego("Juego2", eGenero.ACCION,50);
        ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
        Tienda tienda = new Tienda("Tienda",videojuegos);
        tienda.agregarVideojuego(juego1);
        tienda.agregarVideojuego(juego2);
        System.out.println(tienda);
        System.out.println(tienda.buscarPorGenero(eGenero.ACCION));
        tienda.venderVideojuego("Juego1");
        System.out.println(tienda);
    }
}

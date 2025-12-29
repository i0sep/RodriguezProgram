package Unidad0.Ej3c;

import java.util.List;

public class Bloques {
    public static final Bloque PIEDRA = new Bloque("Piedra", Herramientas.PICO, Items.TROZO_PIEDRA);
    public static final Bloque GRAVA = new Bloque("Grava", Herramientas.PALA, Items.FLINT);
    public static final Bloque TRONCO = new Bloque("Tronco", Herramientas.HACHA, Items.MADERA);
    public static final Bloque COBWEB = new Bloque("Cobweb", Herramientas.ESPADA, Items.HILO);

    public static List<Bloque> allBloques = List.of(PIEDRA, GRAVA, TRONCO, COBWEB);

    public static Bloque bloqueRandom(){
        return allBloques.get((int)(Math.random()*3));
    }
}

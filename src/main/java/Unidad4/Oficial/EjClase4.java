package Unidad4.Oficial;

import java.util.ArrayList;

public class EjClase4 {
    public static void main(String[] args) {
        ArrayList<String> salas = new ArrayList<String>();
        salas.add("Tesoro");

        salas.add("Mercader");

        System.out.println("print1: " + salas);
        salas.add(1, "Trampa");

        System.out.println("print2: " + salas);
        salas.remove("Trampa");
        System.out.println("print3: " + salas);

    }
}

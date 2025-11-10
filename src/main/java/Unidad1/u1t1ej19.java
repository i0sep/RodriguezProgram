package Unidad1;

import java.util.Scanner;
public class u1t1ej19 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Cuantos ingredientes tienes: ");
        int numIngredientes = skanner.nextInt();
        System.out.print("¿Tienes la receta? (true/false): ");
        boolean tieneReceta = skanner.nextBoolean();
        final int INGREDIENTES_MINIMOS = 5;

        String poder = ((numIngredientes>=INGREDIENTES_MINIMOS)&&tieneReceta)?"Se puede preparar la receta":"No se puede preparar la recete";
        System.out.println("------------------------");
        System.out.println(poder);


    }
}
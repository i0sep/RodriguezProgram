package Unidad2;

import java.util.Scanner;
public class u2t3ej1 {
    public enum laSemana {                                         //crea la enumeracion
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        laSemana diaSemana = null;                                //crea una variable con el tipo enum
        String dia = "";                                          //crea una variable string
        boolean coincide = false;                                 //crea un check
        System.out.print("Dime un día de la semana: ");
        do {
            dia = skanner.nextLine().toUpperCase();               //recibe y cambia la variable a uppercase
                for (laSemana temp : laSemana.values()) {         //crea una variable temporal para comprarla con todos los distintos valores de la enumeracion
                    if (temp.name().equalsIgnoreCase(dia)) {      //compara esa variable temporal con la variable introducida por el usuario. Si es cierto hace lo que esta dentro del if :D.
                        coincide = true;                          //si coincide le da el valor a true al checker
                        diaSemana = temp;                         //vuelca el valor temporal a la variable enum (para uso futuro)
                        break;                                    //rompe el bucle for para seguir con el codigo
                    }
                }
            if (!coincide) {                                      //Si el check es falso imprime texto de error
                System.out.print("No es un día válido. Inténtalo de nuevo: ");
            }
        }while (!coincide);                                       //Si el check es falso vuelve a hacer todo otra vez.


        switch (diaSemana){                                       //Compara la variable enum, y segun los casos hace una cosa o otra
            case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES:
                System.out.print("Día de clase");
                break;
            case SABADO:
                System.out.print("Día de descanso activo");
                break;
            case DOMINGO:
                System.out.print("Día de relax total");
                break;
        }

        skanner.close();                                          //Sugerencia del profesor poner al final skanner cuando no lo vayamos a usar
    }
}

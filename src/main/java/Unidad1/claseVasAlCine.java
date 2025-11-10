package Unidad1;

import java.util.Scanner;
public class claseVasAlCine {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.println("¿Quieres ir al cine?");
        String cine = skanner.nextLine();

/*
        if (cine.equals("si")){
            System.out.print("Vas a ir al cine.");
        }
        else if (cine.equals("si")){
            System.out.printf("\u2639");
        }
        else {
            System.out.println("Solo entiendo \"si\" o \"no\"");
        }
*/

        switch (cine){
            case "si":
                System.out.print("Vas a ir al cine.");
            break;
            case "no":
                System.out.printf("\u2639");
            break;
            default:
                System.out.println("Solo entiendo \"si\" o \"no\"");
        }
    }
}
package Unidad2;

import java.util.Scanner;

public class T3ej2 {

    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Introduce el peso del paquete: ");
        double peso = skanner.nextDouble();
        int envio = 0;
        switch ((int)peso){
            case 0:
                System.out.print("El precio del envio es de 3€");
                break;
            case 1,2,3,4:
                System.out.print("El precio del envio es de 5€");
                break;
            case 5,6,7,8,9:
                System.out.print("El precio del envio es de 8€");
                break;
            default:
                System.out.print("El paquete no se puede enviar");
                break;
        }

        skanner.close();
    }
}

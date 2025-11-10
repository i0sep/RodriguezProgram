package Unidad1;

import java.util.Scanner;
public class u1t2ej3 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime dos palabras de mas de 5 letras: ");
        String palabra1 = skanner.next();
        String palabra2 = skanner.next();

        change(palabra1,palabra2);
    }
    public static String change(String palabra1, String palabra2){
        if (palabra1.length()>=5 && palabra2.length()>=5){
        String aux2 = palabra1.substring(palabra1.length()-2);
        String aux1 = palabra2.substring(0,2);
        String last2_1 = palabra1.substring(0,palabra1.length()-2)+aux1;
        String last2_2 = aux2+palabra2.substring(2);
        System.out.println("Palabra 1: "+last2_1);
        System.out.print("Palabra 2: "+last2_2);
        } else {
            System.out.print("Error al ingresar los datos.");
        }
        return "";
    }


}
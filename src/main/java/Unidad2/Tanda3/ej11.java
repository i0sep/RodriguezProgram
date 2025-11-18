package Unidad2.Tanda3;

import java.util.Scanner;

/*
Pedir al usuari@ una contraseña (por ejemplo "java2025") y almacenarla en una
constante.
○ El programa debe permitir un máximo de 3 intentos para acertarla.
○ Debe cumplir:
■ Pedir la contraseña dentro de una función llamada
comprobarContrasena().
■ Si el usuari@ acierta, la función debe mostrar un mensaje y terminar
inmediatamente con return.
■ Si se agotan los intentos, también debe terminar usando return,
informando antes de que hemos agotado los intentos.
 */
public class ej11 {
    public static void main(String[] args) {
        System.out.print("Introduce tu contraseña: ");
        boolean valido = comprobarContraseña();

    }
    public static boolean comprobarContraseña(){
        Scanner skanner = new Scanner(System.in);
        boolean valido = false;
        int intentos = 0;
        do {
            if (intentos>=1){
                System.out.print("Dime otra contraseña: ");
            }
            String password = skanner.nextLine();
            intentos++;
            if (password.equalsIgnoreCase("java2025")){
                System.out.println("Contraseña correcta :D");
                valido = true;
                break;
            }else{
                System.out.println("Contraseña errónea.");
            }

            if (intentos<=3){
                System.out.println(intentos+"/3 Intentos utilizados.");
            }

        }while (intentos<=3);
        return valido;
    }
}

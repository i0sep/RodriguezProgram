package Unidad2;

import java.awt.image.BufferedImageFilter;
import java.util.Scanner;

/*
Un programa el cual le des una contraseña, y te dirá si cumple los requisitos.
Requisitos:
· Debe tener al menos 8 carácteres.
· Debe contener al menos un número.
· Debe contener al menos una letra mayúscula.
 */

/**
 * Clase principal de un programa que valida contraseñas.
 * @author iosep
 * @version 1.0
 * @
 */
public class EjercicioEntrega {

    /**
     * Método principal que ejecuta el programa validador de contraseñas.
     * @param args
     */
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.println("=== VALIDADOR DE CONTRASEÑAS ===");
        boolean volver;
        do {
            System.out.print("Ingrese una contraseña: ");
            String password = skanner.nextLine();

            funcionPassword(password);

            System.out.print("¿Desea validar otra contraseña? (S/N): ");
            String repeticion = skanner.nextLine();
            if (repeticion.equalsIgnoreCase("S")){
                volver = true;
            }else {
                volver = false;
            }
        }while (volver);
    }

    /**
     * Función que valida si la contraseña es correcta.
     * @param password
     * @throws AssertionError
     */
    public static void funcionPassword(String password){
        assert !password.isEmpty() : "La contraseña no puede estar vacía";
        assert password.length() <= 24 : "La contraseña no puede tener más de 24 caracteres";

        boolean cumpleTodosRequisitos = true;

        System.out.println(" Requisitos cumplidos/no cumplidos:");
        if (password.length()>=8){
            System.out.println("  - Tiene al menos 8 caracteres ✅");
        }else {
            System.out.println("  - Tiene al menos 8 caracteres ❌");
            cumpleTodosRequisitos = false;
        }
        if (contieneNumero(password)){
            System.out.println("  - Contiene al menos un número ✅");
        }else {
            System.out.println("  - Contiene al menos un número ❌");
            cumpleTodosRequisitos = false;
        }
        if (!password.equals(password.toLowerCase())){
            System.out.println("  - Contiene al menos una letra mayúscula ✅");
        }else {
            System.out.println("  - Contiene al menos una letra mayúscula ❌");
            cumpleTodosRequisitos = false;
        }

        if (cumpleTodosRequisitos){
            System.out.println("\n---Contraseña válida.---");
        }
    }


    /**
     * Verifica si uno de los requisitos. Si la contraseña contiene numeros.
     * @param password
     * @return true, en caso de que la contraseña contenga números. false en caso contrario.
     */
    public static boolean contieneNumero(String password){
        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }
}

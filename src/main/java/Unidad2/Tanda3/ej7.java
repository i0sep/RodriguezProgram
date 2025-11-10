package Unidad2.Tanda3;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;
        /*
        Crea un programa que simule un sistema de inicio de sesión con las siguientes condiciones:
            ○ El usuari@ tiene 3 intentos para introducir correctamente el nombre de
                usuari@ y la contraseña.
            ○ Si se falla 3 veces el programa terminará y avisará de ello.
            ○ Si acierta, se muestra un menú con 3 opciones:
                ■ 1. Mostrar mensaje de bienvenida
                ■ 2. Mostrar fecha del sistema
                ■ 3. Salir
            ○ El menú debe repetirse (con un bucle do-while) hasta que el usuari@ elija la
                opción 3 (Salir).
            ○ El código debe usar:
                ■ Funciones para separar cada parte del programa (login(),
                mostrarMenu(), procesarOpcion()...).
         */

/**
 * @author Yo
 * @version 0.1
 * Clase para el ejercicio 7
 */

public class ej7 {

    /**
     *
     * @param args
     * Llama a las funciones principales
     */

    public static void main(String[] args) {
        String user = login();
        if (!user.equals("error")) {
            mostrarMenu(user);
        }
    }

    /**
     * Funcion que verifica un usuario y contraseña
     * @return String con nombre usuario
     */
    public static String login() {
        Scanner skanner = new Scanner(System.in);
        String user;
        String password;
        int contador = 0;
        do {
            System.out.print("Introduce primero tu usuario y luego tu contraseña: ");
            user = skanner.nextLine();
            password = skanner.nextLine();
            if (user.equals("minipekka") && password.equals("aña")) {
                return user;
            }
            contador++;
            System.out.println("Error al ingresar los datos " + contador + "/3");
            if (contador==3){
                System.out.println("Has superado el número máximo de intentos. Programa terminado.");
            }
        } while (contador < 3);
        skanner.close();
        return "error";
    }

    /**
     *
     * @param user
     * Funcion para mostrar menú
     */

    public static void mostrarMenu(String user) {
        Scanner skanner = new Scanner (System.in);
        int respuesta = 0;
        do {
            System.out.println("Menú de opciones (elija una):");
            System.out.println("1. Mostrar mensaje de bienvenida.");
            System.out.println("2. Mostrar fecha del sistema.");
            System.out.println("3. Salir.");
            try{
                respuesta = skanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error al introducir el tipo de dato."+ e);
                skanner.nextLine();
            }
            //salir = procesarOpcion(respuesta,user,salir);

        } while (procesarOpcion(respuesta,user));
        System.out.println("Terminando mostrar menú");
    }

    /**
     *
     * @param contador
     * @param user
     * @return Boolean para salir bucle
     * Procesa opciones
     */
    public static boolean procesarOpcion(int contador, String user) {
        boolean repetir;
        switch (contador) {
            case 1:
                System.out.println("Bienvenido " + user);
                repetir = true;
                break;
            case 2:
                LocalTime horaActual = LocalTime.now();
                System.out.println("Hora actual: " + horaActual.withNano(0));
                repetir = true;
                break;
            case 3:
                System.out.print("Saliendo del programa.");
                return repetir=false;
            default:
                System.out.println("Opción inválida.");
                repetir = true;
                return repetir;
        }
        return repetir;
    }
}

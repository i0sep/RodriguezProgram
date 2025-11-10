package Unidad2;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Pedir por la entrada estándar 3 datos: kWh consumidos (entero positivo), tramo
    horario ("punta", "llano", "valle") y si el usuario es “bonificado” (S/N).
        ○ El programa debe:
        ■ Calcular el consumo teniendo en cuenta los precios base por kWh:
        punta 0.30€, llano 0.20€, valle 0.12€.
        ■ Si kWh > 500 se aplicará un 5% descuento sobre el consumo.
        ■ Si es bonificado se aplicará un 7% sobre el consumo.
        ■ Repetiremos los cálculos con los nuevos datos hasta que el usuario
        escriba “salir”.
        ■ Se deben controlar las entradas inválidas con try-catch mostrando un
        aviso y continuando el bucle.
        ■ Utilizar finally para imprimir una línea separadora entre petición y
        petición.
 */
public class T4ej6 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        int kwh = 0; String tramo = ""; boolean bonificado = false;String salir = "";
        do {
            try {
                System.out.print("¿Desea salir? (escriba salir): ");
                salir = skanner.nextLine();
                System.out.print("Ingresa kWh consumidos: ");
                kwh = skanner.nextInt();
                System.out.print("Ingresa el tramo horario: ");
                tramo = skanner.nextLine();
                System.out.print("¿Usuario bonificado?");
                bonificado = skanner.nextBoolean();
            }catch (InputMismatchException e){
                System.out.println("Los tipos de datos fueron erroneamente introducidos: "+e);
                System.out.println("Vuelve a introducir los datos.");
            }finally {
                System.out.println("------------------------------------------------");
            }

            double ntramo = funcionTramo(tramo);
            double descuentokwh = descuento(kwh);
            double bonificadokwh = bonificado(bonificado);
        }while (!salir.equalsIgnoreCase("salir")||tramo.equalsIgnoreCase("salir"));

    }
    public static double funcionTramo(String texto) {
        double tramoNumero = 0;
        final String PUNTA = "punta";
        final String LLANO = "llano";
        final String VALLE = "valle";
        if (texto.equalsIgnoreCase(PUNTA)){
            tramoNumero = 0.30;
        } else if (texto.equalsIgnoreCase(LLANO)) {
            tramoNumero = 0.20;
        } else if (texto.equalsIgnoreCase(VALLE)) {
            tramoNumero = 0.12;
        }
        return tramoNumero;
    }
    public static double descuento(int kwh){
        double descuento;
        descuento = (kwh>500)?0.05:0;
        return descuento;
    }
    public static double bonificado(boolean bonificado){
        double descuentokwh2;
        descuentokwh2 = (bonificado)?0.07:0;
        return descuentokwh2;
    }
}

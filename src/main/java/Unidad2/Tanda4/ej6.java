package Unidad2.Tanda4;
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

public class ej6 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        double kwh = 0; String tramo = ""; String bonificadoS = "";String salir = "";
        do {
            try {
                System.out.print("¿Desea salir? (escriba salir): ");
                salir = skanner.next();
                if (salir.equalsIgnoreCase("salir")){
                    continue;
                }
                System.out.print("Ingresa kWh consumidos: ");
                kwh = skanner.nextInt();
                System.out.print("Ingresa el tramo horario (punta,llano,valle): ");
                tramo = skanner.next();
                System.out.print("¿Usuario bonificado? ");
                bonificadoS = skanner.next();
            }catch (InputMismatchException e){
                System.out.println("Los tipos de datos fueron erroneamente introducidos: "+e);
                System.out.println("Vuelve a introducir los datos.");
                skanner.nextLine();
            }finally {
                System.out.println("------------------------------------------------");
            }

            double ntramo = funcionTramo(tramo);
            double descuentokwh = descuento(kwh);
            double bonificadokwh = bonificado(bonificadoS);

            bonificadokwh *= kwh;
            descuentokwh *= kwh;
            kwh = kwh - (descuentokwh + bonificadokwh);
            kwh = kwh * ntramo;

            System.out.printf("El precio total del consumo es de %.2f\n",kwh);
        }while (!(salir.equalsIgnoreCase("salir"))&&!(tramo.equalsIgnoreCase("salir")));

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
        }else{
            tramoNumero = 0.20;
        }
        return tramoNumero;
    }
    public static double descuento(double kwh){
        double descuento;
        descuento = (kwh>500)?0.05:0;
        return descuento;
    }
    public static double bonificado(String bonificado){
        double descuentokwh2;
        descuentokwh2 = (bonificado.equalsIgnoreCase("si"))?0.07:0;
        return descuentokwh2;
    }
    public static double precioFinal(){
        double precioFinal = 0;
        return precioFinal;
    }
}
import java.util.Scanner;

public class aaaaTESTING {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        System.out.println("\nIntroduce números enteros. Escribe -1 para terminar:");
        int numero = 0;
        while (numero != -1) {
            try {
                System.out.print("Número: ");
                numero = scanner.nextInt();
                if (numero != -1){
                    suma += numero;
                    contador++;
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada no válida. Por favor, ingresa un número entero.");
                scanner.next();
            }
        }
        double promedio = (double)suma / contador;
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}
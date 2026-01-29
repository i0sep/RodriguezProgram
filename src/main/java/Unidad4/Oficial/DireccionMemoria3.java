package Unidad4.Oficial;

public class DireccionMemoria3 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        System.out.println(numeros);

        cambio(numeros);

        System.out.println(numeros);
    }
    public static void cambio(int[] numeros){
        int[] aux = new int[3];
        System.out.println("Dirección de memoria de aux (1) = " + aux);
        System.out.println("Dirección de memoria de numeros (1) = " + numeros);
        numeros = aux;

        System.out.println("Dirección de memoria de aux (2) = " + aux);
        System.out.println("Dirección de memoria de numeros (2) = " + numeros);
    }
}

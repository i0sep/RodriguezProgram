package Unidad4.Oficial;

public class DireccionMemoria4 {
    public static void main(String[] args) {
        int[] numeros1 = new int[3];
        int[] numeros2 = new int[3];
        System.out.println("1 " +numeros1);
        System.out.println("2 " +numeros2);

        cambio(numeros1,numeros2);

        System.out.println("1 "+numeros1);
        System.out.println("2 "+numeros2);
    }
    public static void cambio(int[] numeros1,int[] numeros2){
        System.out.println("Dirección de memoria de numeros (1) = " + numeros1);
        System.out.println("Dirección de memoria de numeros2 (1) = " + numeros2);
        System.out.println("-----------------------------------");
        numeros1 = numeros2;

        System.out.println("Dirección de memoria de numeros (2) = " + numeros1);
        System.out.println("Dirección de memoria de numeros2 (2) = " + numeros2);
    }
}
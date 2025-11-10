package Unidad2;

import java.util.Scanner;

public class u2t3ej10 {
    /*
                Pedir 2 números al usuari@. Si son múltiplos entre ellos (uno o otro) seguir pidiendo
                hasta que no lo sean.
            ○ Crear dos bucles anidados (del número más pequeño hasta el número más
                grande incrementando y del número más grande hasta el número más
                pequeño decrementando).
            ○ Utilizar break para salir del bucle “interior” cuando los iteradores sean
                iguales.
            ○ Imprimir al final el número de interacciones realizadas.
     */
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        int n1;int n2;int contador = 0;
        do {
            System.out.print("Dime dos números: ");
            n1 = skanner.nextInt();
            n2 = skanner.nextInt();
            if (n1 % n2 == 0 || n2 % n1 == 0) {
                System.out.println("Son múltiplos entre sí. Intenta de nuevo.\n");
            }
        } while (n1 % n2 == 0 || n2 % n1 == 0);
        int menor = Math.min(n1, n2);
        int mayor = Math.max(n1, n2);
        for (int i = menor; i <= mayor; i++){
            for (int j = mayor; j >= menor; j--){
                System.out.println(i+" "+j);
                contador ++;
                if (i==j){
                    break;
                }

            }
        }
        System.out.print("Número de interacciones realizadas: "+contador);
    }
}

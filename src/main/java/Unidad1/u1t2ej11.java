package Unidad1;

import java.util.Scanner;
public class u1t2ej11 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        /*
    Escribir una función que dados 4 números enteros imprima por pantalla los 2
    números de “en medio” indicando cuál de estos 2 menor o si son iguales
         */
        System.out.print("Dime 4 números: ");
        int n1 = skanner.nextInt();
        int n2 = skanner.nextInt();
        int n3 = skanner.nextInt();
        int n4 = skanner.nextInt();

        medio(n1,n2,n3,n4);
        System.out.print("");
    }
    public static int medio(int n1,int n2, int n3,int n4){
        int mayor = Math.max(n1,Math.max(n2,Math.max(n2,n4)));
        int menor = Math.min(n1,Math.min(n2,Math.min(n2,n4)));
        int medio1 = (n1 != mayor && n1 != menor)?n1:(n2 != mayor && n2 != menor)?n2:(n3 != mayor && n3 != menor)?n3:n4;
        int medio2 = -(mayor+menor+medio1)+(n1+n2+n3+n4);
        String answ = (medio1>medio2)?"El número de en medio mayor a menor son: "+medio1+" y "+medio2:"El número de en medio mayor a menor son: "+medio1+" y "+medio2;
        System.out.print(answ);
        return 0;
    }
}
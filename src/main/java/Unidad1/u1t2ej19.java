package Unidad1;

import java.util.Scanner;

public class u1t2ej19 {
    public static void main(String[] args) {
        /*
        Escribir 2 funciones:
    ○ int invertido3(int n) que, dado un entero de tres cifras positivo o negativo
        (100..999 o -999..-100), devuelva el número con sus cifras invertidas
        (conservando el signo).
    ■ Si el número no es de 3 cifras, informará de ello.
        ○ String capicua3(int n) que devuelva "capicúa" si n (en valor absoluto) es igual
        a su invertido, o "no capicúa" en caso contrario.
         */
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime un número de 3 cifras: ");
        int a = skanner.nextInt();
        int b = String.valueOf(a).replace("-", "").length();
        String cifras3 = (b==3)?"El número es de 3 cifras":"El número no es de 3 cifras";
        System.out.println(cifras3);
        int invertido = (b==3)?invertido3(a):0;
        String capicua = (b==3)?capicua(a):"Error";
        System.out.println("El número invertido es: "+invertido);
        System.out.println(capicua);
    }
    public static int invertido3(int a){
        String sA = String.valueOf(a);
        String a1 = sA.substring(0,1);
        String a2 = sA.substring(1,2);
        String a3 = sA.substring(2,3);
        String a4 = sA.substring(3);
        String anws = (sA.length()==3)?a3+a2+a1:a1+a4+a3+a2;
        a = Integer.valueOf(anws);
        return a;
    }
    public static String capicua(int a){
        a = Math.abs(a);
        String sA = String.valueOf(a);
        String a1 = sA.substring(0,1);
        String a2 = sA.substring(1,2);
        String a3 = sA.substring(2,3);
        String anws = (a1==a3)?"Es capicúa.":"No es capicúa";
        return anws;
    }
}

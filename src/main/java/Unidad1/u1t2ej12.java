package Unidad1;

import java.util.Scanner;

public class u1t2ej12 {
    public static void main(String[] args) {
        /*
    Crea una función int signo(int n) que retorne -1 si es negativo, 0 si es cero, y 1 si es
    positivo, usando una única expresión con operadores lógicos/ariméticos y ternario.
    Muestra el resultado con printf.
         */
        Scanner skanner = new Scanner(System.in);
        System.out.println("Dime un número negativo, positivo o = 0.");
        int nm = skanner.nextInt();
        /*
        if (nm == 0){
            System.out.print("El número es 0.");
        } else if (nm > 0) {
            System.out.print("El número es positivo.");
        }else {
            System.out.print("El número es negativo.");
        }
        */
        String answ = (nm == 0)?"El número es igual a 0.":(nm > 0)?"El número es positivo.":(nm < 0)?"El número es negativo.":"";
        System.out.println(answ);
    }
}
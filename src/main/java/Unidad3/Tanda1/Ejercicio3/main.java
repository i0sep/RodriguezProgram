package Unidad3.Tanda1.Ejercicio3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumeroAleatorio aleatorio1 = new NumeroAleatorio();
        NumeroAleatorio aleatorio2 = new NumeroAleatorio();
        NumeroAleatorio aleatorio3 = new NumeroAleatorio();
        NumeroAleatorio aleatorio4 = new NumeroAleatorio();
        NumeroAleatorio aleatorio5 = new NumeroAleatorio();
        boolean seguir = false;
        System.out.println(NumeroAleatorio.getTotal());
        do {
            System.out.println("----------------------------");
            System.out.println(NumeroAleatorio.aleatorio10());
            System.out.println(NumeroAleatorio.aleatorioX(20,30));
            if (scanner.nextLine().equalsIgnoreCase("s")){
                seguir = true;
            }else seguir = false;
        }while (seguir);
    }
}

package Unidad1;

import java.util.Scanner;
public class u1t1ej10 {
    public static void main(String[] args) {
        Scanner nn = new Scanner(System.in);
        System.out.print("Dime tu nota (0-10): ");
        double nota = nn.nextInt();
        String solucion = (nota>=5)?(nota>=7)?(nota>=9)?"Tienes un sobresaliente":"Tienes un notable":"Estás aprovado":"Estás supenso";
        System.out.print(solucion);
    }
}
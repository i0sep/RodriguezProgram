package Unidad1;

import java.util.Scanner;

public class u1t1ej9 {

    public static void main(String[] args) {
        Scanner nn = new Scanner(System.in);
        System.out.print("Dime una hora (24h formato): ");
        int hora = nn.nextInt();
        System.out.print("Dime los minutos: ");
        int minutos = nn.nextInt();

        String answ = (hora>=6&&hora<14)?"Este horario corresponde al horario de mañana":"Este horario no corresponde al horario de mañana";
        System.out.println(answ);
    }
}
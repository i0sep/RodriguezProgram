package Unidad1;

import java.util.Scanner;
public class u1t2ej7 {

    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Cuantos segundos: ");
        int seconds = skanner.nextInt();

        fsegundos(seconds);
    }

    public static int fsegundos(int Oseconds){
        int hours = Oseconds/3600;
        int minutes = (-(hours*3600)+Oseconds)/60;
        int seconds = -(hours*3600)-(minutes*60)+Oseconds;

        String hoursminutes = plural(hours,minutes);

        System.out.print(hoursminutes+seconds+" segundos");
        return 0;
    }

    public static String plural(int hours, int minutes){

        String plural1 = (hours>1||hours<1)?" horas, ":" hora, ";
        String plural2 = (minutes>1||minutes<1)?" minutos y ":" minuto y ";
        String plurals = hours+plural1+minutes+plural2;
        return plurals;
    }
}
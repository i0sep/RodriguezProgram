package Unidad1;

import java.util.Scanner;

public class u1t2ej18 {

    public static void main(String[] args) {
    /*
    Lee una hora en formato 24h como entero de 4 dígitos hhmm (por ejemplo, 0930,
    1305, 0000). Implementar una función String a 12h(int hhmm) que:
○ Extraiga horas y minutos con división y módulo,
○ Calcule las horas 12h (0,12 -> 12, 13->1, etc.),
○ Devuelva un texto tipo "1:05 PM" o "12:00 AM".
○ Usar el operador ternario para decidir AM/PM y el caso 0/12.
    Imprime el resultado formateado con printf.
     */
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime la hora en formato hhmm (24h): ");
        int hora = skanner.nextInt();
        String answ = string(hora);
    }
    public static String string(int nHoraMinuto){
        String sHoraMinuto = String.valueOf(nHoraMinuto);
        String sHora = sHoraMinuto.substring(0,2);
        String sMinuto = sHoraMinuto.substring(2);
        int nHora = Integer.parseInt(sHora);
        int nMinuto = Integer.valueOf(sMinuto);
        nHora = (nHora>12)?nHora=nHora-12:nHora;
        String formato = (nHora>=12)?"pm":"am";
        System.out.printf("%d:%d %s%n",nHora,nMinuto,formato);
        String answ = ""+nHora+":"+nMinuto+" "+formato;
       return answ;
    }
}

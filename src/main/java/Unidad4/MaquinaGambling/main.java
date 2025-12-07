package Unidad4.MaquinaGambling;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 300; String tirar = ""; String slot1; String slot2; String slot3; int record = 300;
        System.out.println("Balance: "+balance);
        do {
            System.out.print("¿Deseas hacer una tirada?: ");
            tirar = scanner.nextLine();
            if (tirar.equalsIgnoreCase("s")){
                if (balance>0){
                    balance = balance-10;
                }else{
                    System.out.println("No puedes seguir tirando eres pobre.");
                    break;
                }
            }else continue;

            slot1 = funcionTirada();
            slot2 = funcionTirada();
            slot3 = funcionTirada();
            System.out.println("--------------------");
            System.out.println("----SLOT-MACHINE----");
            System.out.println("---"+slot1+"----"+slot2+"----"+slot3+"--");
            System.out.println("====================");
            int ganancia = funcionGanancia(slot1,slot2,slot3);
            System.out.println("HAS GANADO: "+ganancia);
            balance = balance+ganancia;
            if (record<balance){
                record = balance;
            }
            System.out.println("Tu nuevo balance: "+balance+"$");
            System.out.println("Tu record es: "+record+"$");
        }while (tirar.equalsIgnoreCase("s"));
    }
    public static String funcionTirada(){     //🪨🍋🍒🔔🍀💎💵
        int random = (int)(Math.random()*7);
        String salida = "";
        if (random == 0){
            salida = "\uD83C\uDF4B"; //🍋
        } else if (random == 1) {
            salida = "\uD83C\uDF52"; //🍒
        } else if (random == 2) {
            salida = "\uD83D\uDD14"; //🔔
        } else if (random == 3) {
            salida = "\uD83C\uDF40"; //🍀
        } else if (random == 4) {
            salida = "\uD83D\uDC8E"; //💎
        } else if (random == 5) {
            salida = "\uD83E\uDEA8"; //🪨
        } else if (random == 6) {
            salida = "\uD83D\uDCB5"; //💵
        }
        return salida;
    }
    public static int funcionGanancia(String slot1, String slot2, String slot3){
        int ganacia = 0;
        if ((slot1.equalsIgnoreCase(slot2)) && slot1.equalsIgnoreCase(slot3)){
            if ((slot1.equalsIgnoreCase("\uD83C\uDF4B")) ||
                    slot1.equalsIgnoreCase("\uD83C\uDF52")){     //🍒🍋
                ganacia = 50;
            }
            if ((slot1.equalsIgnoreCase("\uD83D\uDD14")) || slot1.equalsIgnoreCase("\uD83C\uDF40") ||
                    slot1.equalsIgnoreCase("\uD83D\uDC8E")){     //🔔🍀💎
                ganacia = 200;
            }
            if (slot1.equalsIgnoreCase("\uD83D\uDCB5")){         //💵
                ganacia = 500;
            }
        }
        if ((slot2.equalsIgnoreCase(slot1)) && slot2.equalsIgnoreCase(slot3)){
            if ((slot2.equalsIgnoreCase("\uD83C\uDF4B")) ||
                    slot2.equalsIgnoreCase("\uD83C\uDF52")){     //🍒🍋
                ganacia = 50;
            }
            if ((slot2.equalsIgnoreCase("\uD83D\uDD14")) || slot2.equalsIgnoreCase("\uD83C\uDF40") ||
                    slot2.equalsIgnoreCase("\uD83D\uDC8E")){     //🔔🍀💎
                ganacia = 200;
            }
            if (slot2.equalsIgnoreCase("\uD83D\uDCB5")){         //💵
                ganacia = 500;
            }
        }
        if ((slot3.equalsIgnoreCase(slot1)) && slot1.equalsIgnoreCase(slot2)){
            if ((slot3.equalsIgnoreCase("\uD83C\uDF4B")) ||
                    slot3.equalsIgnoreCase("\uD83C\uDF52")){     //🍒🍋
                ganacia = 50;
            }
            if ((slot3.equalsIgnoreCase("\uD83D\uDD14")) || slot3.equalsIgnoreCase("\uD83C\uDF40") ||
                    slot3.equalsIgnoreCase("\uD83D\uDC8E")){     //🔔🍀💎
                ganacia = 200;
            }
            if (slot3.equalsIgnoreCase("\uD83D\uDCB5")){         //💵
                ganacia = 500;
            }
        }
        return ganacia;
    }
}

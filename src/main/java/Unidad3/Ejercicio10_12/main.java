package Unidad3.Ejercicio10_12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Guerrero guerrera = new Guerrero();
        Scanner scanner = new Scanner(System.in);
        int contador = 0; int danioTurno = 0; int expRecibida; int nivelEnemigo; int enemigoMatado = 0;
        do {
            if (contador<=3){
                expRecibida = 2;
                nivelEnemigo = 1;
            }else {
                expRecibida = 3;
                nivelEnemigo = 1;
            }
            Enemigo enemigo = new Enemigo(nivelEnemigo);
            while (enemigo.getVida()>=0) {
                danioTurno = guerrera.atacar();
                enemigo.recibirDanio(danioTurno);
                System.out.println("Has hecho "+danioTurno+" puntos de ataque. "+enemigo.getVida()+" vida restante.");
                guerrera.recibirDanio(enemigo.atacar());
                System.out.println("Te han atacado. Tienes "+guerrera.getVida()+" restante.");
                if (guerrera.getVida()<=0){
                    break;
                }
            }
            if (guerrera.getVida()>0){
                enemigoMatado++;
                guerrera.incExperiencia(expRecibida);
                System.out.println("Tu guerrera tiene estos atributos: "+guerrera.toString());
                System.out.println("Enter para seguir peleando");
                scanner.nextLine();
            }else {
                System.out.println("Has muerto");
            }
            contador++;
        }while (guerrera.getVida()>0);
        System.out.println("Has matado a "+enemigoMatado+" enemigos.");
        scanner.close();
    }
}

package Unidad3.EjercicioDefensaUT3.Ejercicio3;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Animal grillo = new Animal("Grillo",20, 15);
        Animal tortuga = new Animal("Tortuga",10, 8);
        Animal pez = new Animal("Pez",16, 7);

        Animal cangrejo = new Animal("Cangrejo",30, 10);
        Animal saltamontes = new Animal("Saltamontes",14, 6);
        Animal conejo = new Animal("Conejo",20, 3);

        Equipo aliado = new Equipo(grillo,tortuga,pez);
        Equipo enemigo = new Equipo(cangrejo,saltamontes,conejo);

        combate(aliado,enemigo);
        scanner.close();
    }

    public static void combate(Equipo equipoAliado, Equipo equipoEnemigo){
        int turno = 0;

        do {
            System.out.println("Turno 1."+turno);

            equipoEnemigo.recibirAtaque(equipoAliado.atacar());
            equipoAliado.recibirAtaque(equipoEnemigo.atacar());

            turno++;
            System.out.println("Enter para seguir.");
            scanner.nextLine();
        } while (equipoAliado.isAlive() && equipoEnemigo.isAlive());
        if (equipoAliado.isAlive() && !equipoEnemigo.isAlive()){
            System.out.println("Has ganado la batalla :D");
        } else if (!equipoAliado.isAlive() && equipoEnemigo.isAlive()) {
            System.out.println("Has perdido la batalla D:");
        } else {
            System.out.println("Empate ._.");
        }
    }
}

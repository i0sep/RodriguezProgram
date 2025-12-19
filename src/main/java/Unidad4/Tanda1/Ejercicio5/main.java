package Unidad4.Tanda1.Ejercicio5;
/*
            5. Crear un programa en JAVA que:
                    ○ Codifique un objeto que será un Carton de bingo:
                            ■ atributos:
                                    ● un identificador,
                                    ● una matriz de 3x4
                                    ● un array de 3 boolean que nos diga si es línea o no
                                    ● un boolean que nos diga si es bingo o no
                            ■ los constructores:
                                    ● los que vea oportunos el programador/a
                                    I.E.S Gregorio Prieto - Departamento de Informática
                            ■ métodos:
                                    ● comprobar número (se le pasa un número por parámetro para
                                    saber si lo tenemos en el cartón o no)
                                    ● imprimir información (números de mi cartón y si han salido ya
                                    algunos)
                    ○ Desde nuestro main:
                            ■ instanciar un array de 3 objetos Carton
                            ■ rellene los 3 cartones con números del 1 al 88
                            ■ obtener de manera aleatoria números del 1 al 88 hasta que alguien
                            obtenga BINGO.
                            ■ durante el juego se debe informar si alguien consigue LÍNEA e indicar
                            en qué línea.
 */
public class main {
    public static void main(String[] args) {
        int numeroMaximo = 88;
        int[] numerosBingo = new int[numeroMaximo-1];
        Carton carton1 = new Carton(1,88);
        Carton carton2 = new Carton(2,88);
        Carton carton3 = new Carton(3,88);
        int contador = 0; boolean hacer = false;
        do {
            int bola = (int)((Math.random()*(numeroMaximo-1))+1);

            hacer = true;
            for (int numero : numerosBingo){
                if (numero == bola){
                    hacer = false;
                    break;
                }
            }

            if (hacer){
                numerosBingo[contador] = bola;
                contador++;
                carton1.comprobar(bola);
                if (carton1.isBingo()) {
                    continue;
                }
                carton2.comprobar(bola);
                if (carton2.isBingo()) {
                    continue;
                }
                carton3.comprobar(bola);
            }

        } while (!carton1.isBingo() && !carton2.isBingo() && !carton3.isBingo());

    }
}

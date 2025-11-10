package Unidad2;

import java.util.Scanner;

public class T3ej5 {
    /*
    Pedir al usuario una palabra:
        ○ Comprobar que tenga más de 5 letras:
        ■ Si tiene más de 5; utilizar un bucle para contar el número de vocales
        que tiene.
        ■ Si no, informar al usuario y seguir pidiendo.
     */
    public static void main(String[] args) {
        String word = "";   int contador = 0;
        Scanner skanner = new Scanner(System.in);
        do {
            System.out.print("Dime una palabra de 5 letras o más: ");
            word = skanner.nextLine();
        }while (word.length() <= 5);

        for (int i = 0; i < word.length(); i++) {
            char letra = word.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }
        System.out.print("La longitud de la palabra: "+contador);
        skanner.close();
    }
}

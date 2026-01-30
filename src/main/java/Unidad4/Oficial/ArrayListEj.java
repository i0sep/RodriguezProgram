package Unidad4.Oficial;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEj {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> caracteres = new ArrayList<>();

        for (int i = 0; i < 50; i++){
            numeros.add((int)(Math.random()*10));
        }

        for (int i = 0; i < 50; i++){
            caracteres.add("patata"+(char)((Math.random()*93)+33));
        }

        System.out.println(numeros);
        System.out.println(caracteres);

        System.out.println("Y se desordenan");
        System.out.println("-----------------");
        Collections.shuffle(numeros);
        Collections.shuffle(caracteres);
        System.out.println(numeros);
        System.out.println(caracteres);


        System.out.println("Y se ordenan");
        System.out.println("-----------------");
        Collections.sort(numeros);
        Collections.sort(caracteres);
        System.out.println(numeros);
        System.out.println(caracteres);


        System.out.println("Y se dan la vuelta");
        System.out.println("-----------------");
        Collections.reverse(numeros);
        Collections.reverse(caracteres);
        System.out.println(numeros);
        System.out.println(caracteres);
    }
}

package Unidad1;

import java.util.Scanner;
public class u1t2ej6 {

    public static void main(String[] args) {
    Scanner skanner = new Scanner(System.in);
    System.out.print("Dime una palabra de 10 letras: ");
    String word = skanner.nextLine();
    String answ = npar(word);
    System.out.println(answ);
    }
    public static String npar(String word){
        String vocales = word.replaceAll("[^aeiouáéíóú]", "");
        int numvocals = vocales.length();
        String answ = (numvocals%2==0)?"El número es par":"El número es impar";
        return answ;
    }
}
package Unidad1;

import java.util.Scanner;
public class u1t2ej17 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime dos números: ");
        int n1 = skanner.nextInt();
        int n2 = skanner.nextInt();

        String answ = paridadSuma(n1,n2);
        System.out.print(answ);
    }
    public static String paridadSuma(int n1,int n2){
            int sol = n1+n2;
            System.out.print("La suma de "+n1+" y "+n2+" es de: "+sol);
            String answ = (sol%2==0)?"El número de la suma da par":"El número de la suma da impar";
        return answ;
    }
}
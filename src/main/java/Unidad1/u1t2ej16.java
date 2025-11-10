package Unidad1;

import java.util.Scanner;

public class u1t2ej16 {
    public static void main(String[] args) {
        /*
    Implementar: String ordenAsc(int a, int b) que devuelva los dos valores en orden
    ascendente separados por coma (por ejemplo "3, 7").
         */
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime dos números: ");
        int n1 = skanner.nextInt();
        int n2 = skanner.nextInt();

        ordenAsc(n1,n2);
    }
    public static int ordenAsc(int num1,int num2){
            String sol = (num1>num2)?num2+", "+num1:num1+", "+num2;
            System.out.print("Orden ascendente de los números: "+sol);
        return 0;
    }
}
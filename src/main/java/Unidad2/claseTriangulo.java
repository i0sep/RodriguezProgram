package Unidad2;

import java.util.Scanner;

public class claseTriangulo {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime la longitud del triángulo: ");
        int horizontal = skanner.nextInt();
        int cAdelante = 1;
        int cDobleAdelante = 1;
        for (int i = 0;i<=horizontal/2;i++){
            for (int nada = 0; nada<=((horizontal/2)-cAdelante);nada++){
                System.out.print(" ");
            }
            for (int j = 0;j<cDobleAdelante;j++){
                System.out.print("*");
            }
            for (int nada = 0; nada<=((horizontal/2)-cAdelante);nada++){
                System.out.print(" ");
            }
            cAdelante++;
            cDobleAdelante+=2;
            System.out.print("\n");
        }
    }
}

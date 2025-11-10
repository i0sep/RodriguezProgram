package Unidad1;

import java.util.Scanner;

public class u1t2ej14 {

    public static void main(String[] args) {
        /*
    Lee un precio base (double) y un tipo de IVA (int: 1→21%, 2→10%, 3→4%).
    Implementar una función que devuelva double y utilice estos datos (double base, int
    tipo) para calcular el precio total aplicando el porcentaje. Se debe mostrar base, %
    aplicado y total con printf usando especificadores de formato.
         */
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime un precio base: ");
        double preciobase = skanner.nextDouble();
        System.out.println("Dime un tipo de iva (por defecto 21%):\n1.IVA 21%.\n2.IVA 10%.\n3.IVA 4%.");
        int iva = skanner.nextInt();
        iva = (iva>3 && iva<=0)?iva=1:iva;
        iva = (iva==1)?iva=21:iva;
        iva = (iva==2)?iva=10:iva;
        iva = (iva==3)?iva=4:iva;
        double preciofinal = ((iva/100.0)*preciobase)+preciobase;
        System.out.printf("El precio base es %.2f y el iva es %d, el precio final es: %.2f",preciobase,iva,preciofinal);
    }
}

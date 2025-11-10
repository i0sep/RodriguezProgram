package Unidad1;

import java.util.Scanner;
public class u1t1ej16 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime el peso del paquete: ");
        int peso = skanner.nextInt();
        System.out.print("Dime la anchura, altura y profundidad: ");
        int x = skanner.nextInt();
        int y = skanner.nextInt();
        int z = skanner.nextInt();

        //Peso	30kg
        //Dimensiones (Suma total L+A+H)	210cm (Largo + Ancho + Alto)
        //Dimensión Mayor	120cm (Ninguna de las tres medidas puede superar este valor)
        String correo = ((x>=120)|(y>=120)|(z>=120))?"No":(x+y+z<=210)?(peso>=30)?"No":"Si":"No";
        System.out.print(correo+" se puede enviar por correo estándar.");
    }
}
package Unidad1;

import java.util.Scanner;

public class u1t1ej13 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("¿Hay stock?: ");
        boolean hayStock = skanner.nextBoolean();
        System.out.print("¿Es Socio?: ");
        boolean esSocio = skanner.nextBoolean();
        System.out.print("¿El pago fué online?: ");
        boolean pagoOnline= skanner.nextBoolean();
        boolean procesapedido = hayStock&&pagoOnline&&esSocio;
        String pedido = (procesapedido==true)?"El pedido se permite procesar":"El pedido no se permite procesar";
        System.out.print(pedido);
    }
}
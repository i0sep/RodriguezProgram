package Unidad1;

public class clasefunciones1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Estoy dentro de main");
        num1 = cambio(num1,num2);
        System.out.println("Despues de cambio: " + num1);
    }
    public static int cambio(int num1,int num2){
        System.out.println("Estoy dentro de cambio");
        System.out.println("Recibido: " + num1);
        num1 = 20;
        System.out.println("Cambiado: " + num1);
        num2 = 30;
        System.out.println("Cambiado: " + num2);
        return num1;
    }
}
package Unidad3.Tanda1.Ejercicio4;

public class main {
    public static void main(String[] args) {
        CuentaBancaria Yo = new CuentaBancaria();
        CuentaBancaria Mario = new CuentaBancaria();

        Yo.depositar(3000);
        Mario.depositar(100);

        Yo.retirar(400);
        if (Mario.retirar(500)){
            System.out.println("Retiro completado");
        }else System.out.println("Saldo insuficiente");

        System.out.println(Yo.getSaldo());
        System.out.println(Mario.getSaldo());
    }
}

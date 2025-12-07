package Unidad3.Tanda1.Ejercicio4;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private int totalCuentas;

    //constructores
    public CuentaBancaria(String numeroCuenta, double saldo){
        setNumeroCuenta(numeroCuenta);
        setSaldo(saldo);
    }
    public CuentaBancaria(){
        this("ES1212341234120123456789",0);
    }
    public CuentaBancaria(String numeroCuenta){
        this(numeroCuenta,0);
    }

    //Comportamientos
    public boolean depositar(double deposito){
        boolean error;
        if (deposito>=0){
            setSaldo(saldo+deposito);
            error=false;
        }else error=true;
        return error;
    }
    public boolean retirar(double retiro){
        boolean error;
        if (retiro<saldo){
            setSaldo(saldo-retiro);
            error=false;
        }else error=true;
        return  !error;
    }

    //getter y setter
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta.length()==24){
            this.numeroCuenta = numeroCuenta;
        }
    }
}

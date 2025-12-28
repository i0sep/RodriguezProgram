package Unidad0.Ej3a;

public class Calculadora {
    private int num1;
    private int num2;
    Operacion tipo;

    public Calculadora(Operacion tipo){
        setTipo(tipo);
    }

    public int operacion(int num1, int num2){
        return tipo.operacion(num1, num2);
    }



    public void setTipo(Operacion tipo) {
        this.tipo = tipo;
    }
}

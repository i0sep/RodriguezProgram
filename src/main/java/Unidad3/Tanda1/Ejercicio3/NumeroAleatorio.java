package Unidad3.Tanda1.Ejercicio3;

public class NumeroAleatorio {
    private static int total;
    //Constructor
    public NumeroAleatorio(){
        setTotal(total+1);
    }
    //Comportamientos
    public static int aleatorio10(){
        int numero = (int)(Math.random()*10)+1;
        return numero;
    }
    public static int aleatorioX(int rangoInicial, int rangoMaximo){
        int diferencia = rangoMaximo - rangoInicial;
        int numero = (int)(Math.random()*diferencia)+rangoInicial;
        return numero;
    }

    //getter y setter
    public static int getTotal() {
        return total;
    }
    public static void setTotal(int total) {
        NumeroAleatorio.total = total;
    }
}
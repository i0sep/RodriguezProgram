package Unidad4.Oficial;

import java.util.Arrays;

public class DireccionMemoria {
    public static void main(String[] args) {
        int[] a;              // a no tiene direccion de memoria
        int[] b;              // b no tiene direccion de memoria
        int[] c = new int[3]; // b apunta a [0,0,0], tiene memoria
        int[] d = new int[3]; // b apunta a [0,0,0], tiene memoria

        // System.out.println("Dirreccion Original a = "+a);
        // System.out.println("Dirreccion Original a = "+b);
        System.out.println("Dirreccion Original c = "+c);
        System.out.println("Dirreccion Original d = "+d);
        System.out.println("--------------------------------------");


        a = c;                // a comparte la misma dirección de memoria

        b = c.clone();        // b debería de apuntar a la misma dirección de memoria

        d = c;                // d apunta a c (d -> c)
        // Si a d la llevamos a una funcion tiene otra dirección de memoria distinta
        System.out.println("D antes de entrar en la función " + d);
        funcionAbcd(d);
        //funcionImprimirABCD(a,b,c,d);
    }
    public static void funcionImprimirABCD(int[] a,int[] b,int[] c,int[] d){
        System.out.println("Dirección de memoria de c = "+c);
        System.out.println("Dirección de memoria de a = "+a);
        System.out.println("Dirección de memoria de b = "+b);
        System.out.println("Dirección de memoria de d = "+d);
    }
    public static void funcionAbcd(int[] arrayD){
        System.out.println("ArrayD dentro de la funcion = "+arrayD);
        int[] arrayAux = new int[3];

        arrayD = arrayAux;
        // d apunta a aux (d -> c)
        System.out.println("Dirección de memoria de d = " + arrayD);
        System.out.println("Dirección de memoria de Aux = " + arrayAux);
    }



    public static void funcionDuplicar(int[] numero){
        int[] numeros = new int[4];

        System.out.println(numeros);
        System.out.println(numeros[3]);

        funcionDuplicar(numeros);

        System.out.println(numeros);
        System.out.println(numeros[3]);

        int[] aux = {1,2,3,4};

        //numero = aux;               //Convierte la variable en local
        numero = aux.clone();       //Convierte la variable en local

        System.out.println(numero);

        for (int i = 0; i < aux.length; i++){
            numero[i] = aux[i];     //Modifica los valores de la misma dirección de memoria
        }

        System.out.println(Arrays.toString(aux));
    }


    public static void funcionObjeto(int[] numeros){
        System.out.println(numeros);
        DireccionMemoria2 objetoArray = new DireccionMemoria2();
        objetoArray.setObjetoNumeros(numeros);
        numeros[1] = 100;
        System.out.println(objetoArray.getObjetoNumeros()[1]);
    }
}

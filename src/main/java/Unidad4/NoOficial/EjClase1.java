package Unidad4.NoOficial;

public class EjClase1 {
    public static void main(String[] args) {

        parImpar();
    }


    public static int[] cienNoventaUno(){
        int[] numeros = new int[10];

        for(int i = 0; i < 10;i++){
            numeros[i] = 100-i;
            System.out.println(numeros[i]);
        }
        return numeros;
    }



    public static void copiarArray(int[] numeros){
        System.out.println("-------------------------");
        for(int i = 0,j = 9; i < 5;i++,j--){
            int nAux = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = nAux;
        }
        for(int i = 0; i < 10;i++){
            System.out.println(numeros[i]);
        }
    }


    public static void parImpar(){
        int tamanoNumeros = 20;
        int[] pares = new int[tamanoNumeros/2];
        int[] impares = new int[tamanoNumeros/2];
        int contadorPares = 0;
        int contadorImpares = 0;


        for (int i = 1;i <= tamanoNumeros ; i++){
            if (i%2==0){
                pares [contadorPares] = i;
                contadorPares++;
            }else {
                impares [contadorImpares] = i;
                contadorImpares++;
            }
        }
        /*
        for (int i = 0;i < tamanoArray ; i++){
            int auxPar = (i+1)*2;
            int auxImpar = (2*i)+1;
            pares [i] = aux;
            impares [i] = auxImpar;
        }
         */

        for(int i = 0; i < tamanoNumeros/2;i++){
            System.out.println("Pares ["+i+"] = "+pares[i]);
        }
        for(int i = 0; i < tamanoNumeros/2;i++){
            System.out.println("Impares ["+i+"] = "+impares[i]);
        }

        for(int i = 0; i < tamanoNumeros/2;i++){
            int aux = pares[i];
            pares[i] = impares[i];
            impares[i] = aux;
        }

        for(int i = 0; i < tamanoNumeros/2;i++){
            System.out.println("Pares ["+i+"] = "+pares[i]);
        }
        for(int i = 0; i < tamanoNumeros/2;i++){
            System.out.println("Impares ["+i+"] = "+impares[i]);
        }
    }
}

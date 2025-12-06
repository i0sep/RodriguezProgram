package Unidad2;

public class TEST {
    public static void main(String[] args) {
        String numeros = "12-10-8-9-";
        int inicio = 0;
        for (int i = 0; i < numeros.length(); i++){
            if (numeros.charAt(i)== '-'){
                numeros = numeros.substring(inicio,i);
                System.out.println(numeros);
                inicio = i + 1;
            }
        }
    }
}

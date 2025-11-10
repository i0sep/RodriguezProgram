package Unidad1;

public class examen {
    public static void main(String[] args) {
        int num1 = 15; // 00001111
//objetivo = 01001101 (6 <=> 1)
        String binario = Integer.toBinaryString(num1);
        System.out.println("Original: " + num1 + " (Binario: " + binario + ")");
//Truco no recomendado:
//String trucoNoVale = "0010";
//int decimal = Integer.parseInt(trucoNoVale, 2);
        System.out.println((Integer.toBinaryString(64))); //nos interesan estos números en binario
        System.out.println((Integer.toBinaryString(66)));
        int bit6 = num1 >> 5;
        System.out.println(Integer.toBinaryString(bit6));
        int bit6limpio = bit6 & 0b0010;
        System.out.println("b6 decimal: " + bit6limpio + " , b6 binario: " +
                Integer.toBinaryString(bit6limpio));
        int bit1 = num1 << 5;
        System.out.println(Integer.toBinaryString(bit1));
        int bit1limpio = bit1 & 0b01000000;
        System.out.println("b1 decimal: " + bit1limpio + " , b1 binario: " +
                Integer.toBinaryString(bit1limpio));
        int numlimpio = num1 & ~(0b01000010);
        System.out.println("número original \"limpio\": " +
                Integer.toBinaryString(numlimpio));
        int sol = numlimpio | bit6limpio;
        sol = sol | bit1limpio;
        System.out.println(sol);
        System.out.println(Integer.toBinaryString(sol));
    }
}

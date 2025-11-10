package Unidad1;

public class clasebinario {
    public static void main(String[] args) {
        int n1 = 14;
        int n2 = 1;
        // n1 = n1 << 6;
        System.out.println(Integer.toBinaryString(n1));
        System.out.println(Integer.toBinaryString(n2));
        int sol = n1 | n2;
        System.out.println(Integer.toBinaryString(sol));
        System.out.println(sol);

    }
}
package Unidad1;

public class u1t2ej13 {
    public static void main(String[] args) {
        char c = '1';
        String mayus ="";
        mayus = (c>='A' && c<='Z')?"MAYÚSCULA":(c>='a' && c<='z')?"minúscula":"Otro";
        System.out.print(mayus);
    }
}
